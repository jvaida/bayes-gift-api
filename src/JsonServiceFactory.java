public class JsonServiceFactory {
    public static JsonService getJsonService(String type) {
        if (type.equalsIgnoreCase("timer")) {
            return new TimerJsonService();
        } else if (type.equalsIgnoreCase("triage")) {
            return new TriageJsonService();
        } else {
            throw new IllegalArgumentException("Unknown JSON type: " + type);
        }
    }
}