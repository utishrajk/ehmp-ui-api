package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ResourceDescription implements Serializable {

	private String get;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public ResourceDescription() {
		this.get= "";
	}
	
	public ResourceDescription(String str) {
		this.get = str;
	}

	public String getGet() {
		return get;
	}

	public void setGet(String get) {
		this.get = get;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}