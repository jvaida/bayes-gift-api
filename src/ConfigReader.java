import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static final String CONFIG_FILE = "config.properties";
    
    public static String getConfig(String key) {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream(CONFIG_FILE)) {
            properties.load(input);
            return properties.getProperty(key);
        } catch (IOException e) {
            System.err.println("Error reading config file: " + CONFIG_FILE);
            return "";
        }
    }
}