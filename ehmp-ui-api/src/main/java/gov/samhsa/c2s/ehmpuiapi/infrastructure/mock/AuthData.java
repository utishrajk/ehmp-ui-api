/**
 * 
 */
package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthData {

	private List<AuthItem> items = null;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public List<AuthItem> getItems() {
		return items;
	}

	public void setItems(List<AuthItem> items) {
		this.items = items;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}