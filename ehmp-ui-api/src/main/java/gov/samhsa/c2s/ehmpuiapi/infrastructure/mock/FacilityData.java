package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FacilityData {

	private List<FacilityItem> items = null;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public List<FacilityItem> getItems() {
		return items;
	}

	public void setItems(List<FacilityItem> items) {
		this.items = items;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}