import org.json.JSONArray;
import java.io.IOException;
import java.nio.file.*;
import java.util.stream.*;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class JsonService {
    protected abstract String getDirectory();
    
    public JSONArray getJsonData() {
        JSONArray allData = new JSONArray();
        try {
            DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(getDirectory()));
            for (Path path : stream) {
                if (Files.isRegularFile(path)) {
                    allData.put(JsonReader.readJsonFromFile(path.toString()));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading JSON directory: " + getDirectory());
        }
        return allData;
    }
}
