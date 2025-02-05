import java.nio.file.*;
import java.util.stream.Collectors;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;

public class TriageJsonService extends JsonService {
    protected String getDirectory() {
        return ConfigReader.getConfig("triageDirectory");
    }
}