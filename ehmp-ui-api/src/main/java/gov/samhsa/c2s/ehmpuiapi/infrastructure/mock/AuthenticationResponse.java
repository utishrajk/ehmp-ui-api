
package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationResponse {

    private Data data;
    private Integer status;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
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

	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	@Override
	public String toString() {
		return "AuthenticationResponse [data=" + data + ", status=" + status + ", additionalProperties="
				+ additionalProperties + "]";
	}
    
    

}
