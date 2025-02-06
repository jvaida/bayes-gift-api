public class TimerJsonService extends JsonService {
    protected String getDirectory() {
        return ConfigReader.getConfig("timerDirectory");
    }
}