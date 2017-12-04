package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Resource implements Serializable {

	private ResourceData data;
	private Integer status;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public ResourceData getData() {
		return data;
	}

	public void setData(ResourceData data) {
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}