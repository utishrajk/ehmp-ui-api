package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

import java.util.HashMap;
import java.util.Map;

public class Facility {

	private FacilityData data;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public FacilityData getData() {
		return data;
	}

	public void setData(FacilityData data) {
		this.data = data;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
