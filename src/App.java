import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        Integer aux = 0;

        // Fazer conexão HTTP (Protocolo usado para acessar a web) e buscar top 250 filmes
        String url = "https://api.mocki.io/v2/549a5d8b";
        URI endereco = URI.create(url); //Identificador do endereco
        //var client = HttpClient.newHttpClient();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build(); //request - GET - build a request
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString()); // client faz uma requisicao e armazenamos em uma variavel de resposta
        String body = response.body();

        // Coletar apenas os dados: {titulo, postr, classificacao}
        JsonParser parser = new JsonParser(); // Objeto
        List<Map<String, String>> listaDeFilmes = parser.parse(body);  //Associa uma chave com um valor

        // Exibir e manipular os dados da maneira que quisermos
        while (aux != 2) {
            System.out.println("Bem vindo a YourTop10\n1 - Ver top filmes\n2 - Sair do programa\n");
            aux = reader.nextInt();
            switch (aux) {
                case 1:
                    for (Map<String,String> filme : listaDeFilmes) {

                    /* Input do usuario para o enereco da imagem na qual ele quer fazer a figurinha
                        Scanner reader = new Scanner(System.in);
                        System.out.println("Digite o endereco da imagem: ");
                        reader.close();
                    */
                        String enderecoImagem = filme.get("image");
                        String titulo = filme.get("title");

                        String nomeArquivo = "images/" + titulo + ".png";
                        InputStream inputStream = new URL(enderecoImagem).openStream(); // Classe InputStream ler uma fonte de bytes (file, url, byteArray...)
                        System.out.println("Titulo: \u001b[1m" + filme.get("title") + "\u001b[0m");
                        System.out.println("Poster: \u001b[4m"+ filme.get("image") + "\u001b[0m");
                        System.out.println("Nota: " + filme.get("imDbRating"));

                        var geradora = new GeradorDeStickers();
                        geradora.cria(inputStream, nomeArquivo);

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
