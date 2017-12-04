
package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

import java.util.HashMap;
import java.util.Map;

public class Preferences {

    private DefaultScreen defaultScreen;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public DefaultScreen getDefaultScreen() {
        return defaultScreen;
    }

    public void setDefaultScreen(DefaultScreen defaultScreen) {
        this.defaultScreen = defaultScreen;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Preferences [defaultScreen=" + defaultScreen + ", additionalProperties=" + additionalProperties + "]";
	}
    
    

}
