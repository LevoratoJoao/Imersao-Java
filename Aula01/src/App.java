import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        // Fazer conexão HTTP (Protocolo usado para acessar a web) e buscar top 250 filmes
        String url = "https://alura-filmes.herokuapp.com/conteudos";
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
        for (Map<String,String> filme : listaDeFilmes) {
            System.out.println("\u001b[1m" + filme.get("title") + "\u001b[0m");
            System.out.println("\u001b[4m"+ filme.get("image") + "\u001b[0m");
            System.out.println(filme.get("imDbRating"));
            System.out.println();
        }
    }
}
