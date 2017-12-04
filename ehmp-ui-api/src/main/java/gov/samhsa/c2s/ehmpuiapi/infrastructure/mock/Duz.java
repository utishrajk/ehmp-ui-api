
package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

import java.util.HashMap;
import java.util.Map;

public class Duz {

    private String c877;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getC877() {
        return c877;
    }

    public void setC877(String c877) {
        this.c877 = c877;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Duz [c877=" + c877 + ", additionalProperties=" + additionalProperties + "]";
	}
    
    

}
