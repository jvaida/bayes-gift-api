import java.nio.file.*;
import org.json.JSONObject;
import java.io.IOException;

public class TimerJsonService extends JsonService {
    protected String getDirectory() {
        return ConfigReader.getConfig("timerDirectory");
    }
}