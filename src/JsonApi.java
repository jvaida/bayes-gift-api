import org.json.JSONObject;
import org.json.JSONArray;
public class JsonApi {
    public static JSONArray getJson() {
        JsonService service = JsonServiceFactory.getJsonService();
        JSONArray jsonData = service.getJsonData();
        
        return jsonData;
    }
}
