package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

import java.util.HashMap;
import java.util.Map;

public class WHDLink {

	private String title;
	private String href;
	private String rel;
	private WHDDescription description;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getRel() {
		return rel;
	}

	public void setRel(String rel) {
		this.rel = rel;
	}

	public WHDDescription getDescription() {
		return description;
	}

	public void setDescription(WHDDescription description) {
		this.description = description;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}