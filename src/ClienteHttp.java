import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ClienteHttp {

    public String buscaDados(String url) {

        try {
            URI endereco = URI.create(url); //Identificador do endereco
            //var client = HttpClient.newHttpClient();
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(endereco).GET().build(); //request - GET - build a request
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString()); // client faz uma requisicao e armazenamos em uma variavel de resposta
            String body = response.body();
            return body;

        } catch (IOException | InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
