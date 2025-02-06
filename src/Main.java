import org.json.JSONObject;
import org.json.JSONArray;
public class Main {
    public static void main(String[] args) {
        JsonService service = JsonServiceFactory.getJsonService();
        JSONArray jsonData = service.getJsonData();
        
        System.out.println(jsonData.toString(4));
    }
}
