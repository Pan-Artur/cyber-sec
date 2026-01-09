import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            String urlString = "https://www.youtube.com/";
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int status = connection.getResponseCode();
            System.out.println("Status code: " + status);

            System.out.println("Status line: " + connection.getHeaderField(0));

            System.out.println("Headers:");
            connection.getHeaderFields().forEach((key, value) -> System.out.println("  " + key + ": " + value));

            BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
            );

            String line;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
