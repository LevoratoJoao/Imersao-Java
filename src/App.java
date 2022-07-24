import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        Integer aux = 0;

        // Fazer conexão HTTP (Protocolo usado para acessar a web) e buscar conteudos
        // String url = "https://api.mocki.io/v2/549a5d8b";
        // ExtratorConteudo extrator = new ExtratorConteudoIMDB();

        String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14";
        ExtratorConteudo extrator = new ExtratorConteudoNasa();

        var http = new ClienteHttp();
        String json = http.buscaDados(url);


        // Exibir e manipular os dados da maneira que quisermos
        List<Conteudo> conteudos = extrator.extraiConteudos(json);

        while (aux != 2) {
            System.out.print("Bem vindo a YourTop10\n1 - Ver top\n2 - Sair do programa\n");
            aux = Integer.parseInt(reader.nextLine());
            switch (aux) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        Conteudo conteudo = conteudos.get(i);

                        // Classe InputStream ler uma fonte de bytes (file, url, byteArray...)
                        InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
                        String nomeArquivo = "images/" + conteudo.getTitulo() + ".png";

                        var geradora = new GeradorDeStickers();
                        geradora.cria(inputStream, nomeArquivo);

                        System.out.println(conteudo.getTitulo());
                        System.out.println();
                    }
                    break;
                case 2:
                    reader.close();
                    break;
                default:
                    break;
            }
        }
    }
}
