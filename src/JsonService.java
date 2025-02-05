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
        // get all json files data from chosen directory
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
        
        String casualtyId = ConfigReader.getConfig("casualty_id");
        if (casualtyId.isEmpty()) {
            return allData;
        }
        
        JSONArray filteredData = new JSONArray();
        for (int i = 0; i < allData.length(); i++) {
            Object obj = allData.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jsonObject = (JSONObject) obj;
                if (casualtyId.equals(jsonObject.optString("casualty_id"))) {
                    filteredData.put(jsonObject);
                }
            }
        }
        return filteredData;
    }
}