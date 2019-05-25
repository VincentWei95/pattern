package flyweight;


import java.util.HashMap;
import java.util.Map;

public class WebsiteFactory {
    private Map<String, Website> websiteMap = new HashMap<>();

    public Website getWebsiteCategory(String key) {
        if (websiteMap.get(key) == null) {
            websiteMap.put(key, new ConcreteWebsite(key));
        }
        return websiteMap.get(key);
    }

    public int getWebsiteCount() {
        return websiteMap.size();
    }
}
