package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

import java.util.HashMap;
import java.util.Map;

public class FacilityItem {

	private String facilityCode;
	private String facilityMoniker;
	private String facilityName;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getFacilityCode() {
		return facilityCode;
	}

	public void setFacilityCode(String facilityCode) {
		this.facilityCode = facilityCode;
	}

	public String getFacilityMoniker() {
		return facilityMoniker;
	}

	public void setFacilityMoniker(String facilityMoniker) {
		this.facilityMoniker = facilityMoniker;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
