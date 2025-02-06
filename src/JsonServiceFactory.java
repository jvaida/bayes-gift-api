public class JsonServiceFactory {
    public static JsonService getJsonService() {
        String type = ConfigReader.getConfig("typeNeeded");
        if (type.equalsIgnoreCase("timer")) {
            return new TimerJsonService();
        } else if (type.equalsIgnoreCase("triage")) {
            // String casualty_id = ConfigReader.getConfig("casualty_id");
            return new TriageJsonService();
        } else {
            throw new IllegalArgumentException("Unknown JSON type: " + type);
        }
    }
}