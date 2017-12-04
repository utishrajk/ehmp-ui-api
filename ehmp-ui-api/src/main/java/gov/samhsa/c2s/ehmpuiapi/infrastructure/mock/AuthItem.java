package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

import java.util.HashMap;
import java.util.Map;

public class AuthItem {

	private String name;
	private String division;
	private Boolean production;
	private String siteCode;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Boolean getProduction() {
		return production;
	}

	public void setProduction(Boolean production) {
		this.production = production;
	}

	public String getSiteCode() {
		return siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
