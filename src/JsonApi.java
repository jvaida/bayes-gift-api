import org.json.JSONObject;

public class JsonApi {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java JsonApi <type> <fileName>");
            return;
        }
        
        String type = args[0]; // "timer" or "triage"
        String fileName = args[1];
        
        JsonService service = JsonServiceFactory.getJsonService(type);
        JSONObject jsonData = service.getJsonData(fileName);
        
        System.out.println(jsonData.toString(4));
    }
}
