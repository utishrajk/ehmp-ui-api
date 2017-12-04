
package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {

    private String uid;
    private Boolean disabled;
    private Boolean divisionSelect;
    private Duz duz;
    private String expires;
    private String facility;
    private String firstname;
    private String lastname;
    private Preferences preferences;
    private List<String> permissions = null;
    private List<Object> pcmm = null;
    private Boolean requiresReset;
    private String section;
    private Integer sessionLength;
    private String site;
    private String division;
    private String title;
    private Boolean provider;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Boolean getDivisionSelect() {
        return divisionSelect;
    }

    public void setDivisionSelect(Boolean divisionSelect) {
        this.divisionSelect = divisionSelect;
    }

    public Duz getDuz() {
        return duz;
    }

    public void setDuz(Duz duz) {
        this.duz = duz;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Preferences getPreferences() {
        return preferences;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public List<Object> getPcmm() {
        return pcmm;
    }

    public void setPcmm(List<Object> pcmm) {
        this.pcmm = pcmm;
    }

    public Boolean getRequiresReset() {
        return requiresReset;
    }

    public void setRequiresReset(Boolean requiresReset) {
        this.requiresReset = requiresReset;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Integer getSessionLength() {
        return sessionLength;
    }

    public void setSessionLength(Integer sessionLength) {
        this.sessionLength = sessionLength;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getProvider() {
        return provider;
    }

    public void setProvider(Boolean provider) {
        this.provider = provider;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Data [uid=" + uid + ", disabled=" + disabled + ", divisionSelect=" + divisionSelect + ", duz=" + duz
				+ ", expires=" + expires + ", facility=" + facility + ", firstname=" + firstname + ", lastname="
				+ lastname + ", preferences=" + preferences + ", permissions=" + permissions + ", pcmm=" + pcmm
				+ ", requiresReset=" + requiresReset + ", section=" + section + ", sessionLength=" + sessionLength
				+ ", site=" + site + ", division=" + division + ", title=" + title + ", provider=" + provider
				+ ", additionalProperties=" + additionalProperties + ", getUid()=" + getUid() + ", getDisabled()="
				+ getDisabled() + ", getDivisionSelect()=" + getDivisionSelect() + ", getDuz()=" + getDuz()
				+ ", getExpires()=" + getExpires() + ", getFacility()=" + getFacility() + ", getFirstname()="
				+ getFirstname() + ", getLastname()=" + getLastname() + ", getPreferences()=" + getPreferences()
				+ ", getPermissions()=" + getPermissions() + ", getPcmm()=" + getPcmm() + ", getRequiresReset()="
				+ getRequiresReset() + ", getSection()=" + getSection() + ", getSessionLength()=" + getSessionLength()
				+ ", getSite()=" + getSite() + ", getDivision()=" + getDivision() + ", getTitle()=" + getTitle()
				+ ", getProvider()=" + getProvider() + ", getAdditionalProperties()=" + getAdditionalProperties()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
    

}
