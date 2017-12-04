package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WHDData {

	private List<WHDLink> link = null;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public List<WHDLink> getLink() {
		return link;
	}

	public void setLink(List<WHDLink> link) {
		this.link = link;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
