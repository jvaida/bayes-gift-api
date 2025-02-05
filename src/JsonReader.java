import java.nio.file.*;
import java.io.IOException;
import org.json.JSONObject;

public class JsonReader {
    public static JSONObject readJsonFromFile(String filePath) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            return new JSONObject(content);
        } catch (IOException e) {
            System.err.println("Error reading JSON file: " + filePath);
            return new JSONObject();
        }
    }
}
