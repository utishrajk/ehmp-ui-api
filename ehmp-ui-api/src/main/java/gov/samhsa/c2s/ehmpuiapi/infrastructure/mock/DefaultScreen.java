
package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

import java.util.HashMap;
import java.util.Map;

public class DefaultScreen {

    private String patient;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "DefaultScreen [patient=" + patient + ", additionalProperties=" + additionalProperties + "]";
	}
    
    

}
