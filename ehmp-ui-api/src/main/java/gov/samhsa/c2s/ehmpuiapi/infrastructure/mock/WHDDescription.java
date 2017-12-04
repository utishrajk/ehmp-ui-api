package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

import java.util.HashMap;
import java.util.Map;

public class WHDDescription {

	private String post;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
