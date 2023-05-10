package networking.http_requests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PreJava11 {
    private static HttpURLConnection connection;

    public static void main(String[] args) throws IOException {
        //pre java 11 (HttpURLConnection API):
        //HttpURLConnection is synchronous, should not be used in
        // main thread as it will block operations
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();

        URL url = new URL("https://jsonplaceholder.typicode.com/albums");

        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);

        int status = connection.getResponseCode(); //200 = success

        if (status > 299){
            reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
        } else {
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        }
        while ((line = reader.readLine()) != null){
            responseContent.append(line);
        }
        reader.close();
        System.out.println(responseContent);
        connection.disconnect();
    }
}
