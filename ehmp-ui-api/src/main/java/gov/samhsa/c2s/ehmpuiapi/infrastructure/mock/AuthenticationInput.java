package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

public class AuthenticationInput {
	
	String accessCode;
	String verifyCode;
	String site;
	String division;
	
	public String getAccessCode() {
		return accessCode;
	}
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}
	public String getVerifyCode() {
		return verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
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
	@Override
	public String toString() {
		return "AuthenticationInput [accessCode=" + accessCode + ", verifyCode=" + verifyCode + ", site=" + site
				+ ", division=" + division + "]";
	}
	
	
	
	

}
