import java.io.*;
import java.nio.file.*;
import org.json.JSONObject;

// Service abstract class to read JSON data from a file
public abstract class JsonService {
    protected abstract String getFile();
    protected abstract String getConfigKey();

    public JSONObject getJsonData() {
        String dirName = ConfigReader.getConfig(getConfigKey());
        return JsonReader.readJsonFromFile(dirName + getFile()+ ".json");
    }
}