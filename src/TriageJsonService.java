import java.nio.file.*;
import org.json.JSONObject;
import java.io.IOException;

public class TriageJsonService implements JsonService {
    
    protected String getConfigKey() {
        return "triageDirectory";
    }
    protected String getFile() {
        return "triage";
    }
}