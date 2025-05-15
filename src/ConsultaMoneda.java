import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    Moneda buscaMoneda(String moneda1, String moneda2) throws IOException, InterruptedException {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/492fc2bbe159b73cc5e723be/pair/"+moneda1+"/"+moneda2);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), Moneda.class);
    }
}
