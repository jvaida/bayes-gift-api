import java.nio.file.*;
import org.json.JSONObject;
import java.io.IOException;

public class TimerJsonService extends JsonService {
    
    protected String getConfigKey() {
        return "timerDirectory";
    }
    protected String getFile() {
        return "timer";
    }
}