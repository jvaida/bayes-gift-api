import org.json.JSONArray;
import org.json.JSONObject;

public class TriageJsonService extends JsonService {
    protected String getDirectory() {
        return ConfigReader.getConfig("triageDirectory");
    }
    
    public JSONArray getJsonData() {
        JSONArray allData = super.getJsonData();
        String casualtyId = ConfigReader.getConfig("casualty_id");
        
        if (casualtyId.isEmpty()) {
            return allData;
        }
        
        JSONArray filteredData = new JSONArray();
        for (int i = 0; i < allData.length(); i++) {
            Object obj = allData.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jsonObject = (JSONObject) obj;
                if (casualtyId.equals(jsonObject.optString("casualty_id"))) {
                    filteredData.put(jsonObject);
                }
            }
        }
        return filteredData;
    }
}