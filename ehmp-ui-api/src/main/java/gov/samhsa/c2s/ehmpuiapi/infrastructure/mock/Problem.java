package gov.samhsa.c2s.ehmpuiapi.infrastructure.mock;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1800621033317921940L;
	
	private String dateOfOnset;
	private String problemNumber;
	private String snomedCode;
	private String lexiconCode;
	private String code;
	private String problemName;
	private String problemText;
	private String patientIEN;
	private String patientName;
	private String dateLastModified;
	private String dateRecorded;
	private String enteredBy;
	private String enteredByIEN;
	private String status;
	private String acuity;
	private String responsibleProviderIEN;
	private String responsibleProvider;
	private String recordingProvider;
	private String recordingProviderIEN;
	private List<String> comments = new ArrayList<>();
	private String serviceConnected;
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getDateOfOnset() {
		return dateOfOnset;
	}

	public void setDateOfOnset(String dateOfOnset) {
		this.dateOfOnset = dateOfOnset;
	}

	public String getProblemNumber() {
		return problemNumber;
	}

	public void setProblemNumber(String problemNumber) {
		this.problemNumber = problemNumber;
	}

	public String getSnomedCode() {
		return snomedCode;
	}

	public void setSnomedCode(String snomedCode) {
		this.snomedCode = snomedCode;
	}

	public String getLexiconCode() {
		return lexiconCode;
	}

	public void setLexiconCode(String lexiconCode) {
		this.lexiconCode = lexiconCode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getProblemName() {
		return problemName;
	}

	public void setProblemName(String problemName) {
		this.problemName = problemName;
	}

	public String getProblemText() {
		return problemText;
	}

	public void setProblemText(String problemText) {
		this.problemText = problemText;
	}

	public String getPatientIEN() {
		return patientIEN;
	}

	public void setPatientIEN(String patientIEN) {
		this.patientIEN = patientIEN;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDateLastModified() {
		return dateLastModified;
	}

	public void setDateLastModified(String dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

	public String getDateRecorded() {
		return dateRecorded;
	}

	public void setDateRecorded(String dateRecorded) {
		this.dateRecorded = dateRecorded;
	}

	public String getEnteredBy() {
		return enteredBy;
	}

	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}

	public String getEnteredByIEN() {
		return enteredByIEN;
	}

	public void setEnteredByIEN(String enteredByIEN) {
		this.enteredByIEN = enteredByIEN;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAcuity() {
		return acuity;
	}

	public void setAcuity(String acuity) {
		this.acuity = acuity;
	}

	public String getResponsibleProviderIEN() {
		return responsibleProviderIEN;
	}

	public void setResponsibleProviderIEN(String responsibleProviderIEN) {
		this.responsibleProviderIEN = responsibleProviderIEN;
	}

	public String getResponsibleProvider() {
		return responsibleProvider;
	}

	public void setResponsibleProvider(String responsibleProvider) {
		this.responsibleProvider = responsibleProvider;
	}

	public String getRecordingProvider() {
		return recordingProvider;
	}

	public void setRecordingProvider(String recordingProvider) {
		this.recordingProvider = recordingProvider;
	}

	public String getRecordingProviderIEN() {
		return recordingProviderIEN;
	}

	public void setRecordingProviderIEN(String recordingProviderIEN) {
		this.recordingProviderIEN = recordingProviderIEN;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public String getServiceConnected() {
		return serviceConnected;
	}

	public void setServiceConnected(String serviceConnected) {
		this.serviceConnected = serviceConnected;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "Problem [dateOfOnset=" + dateOfOnset + ", problemNumber=" + problemNumber + ", snomedCode=" + snomedCode + ", lexiconCode=" + lexiconCode + ", code=" + code + ", problemName=" + problemName + ", problemText=" + problemText + ", patientIEN=" + patientIEN + ", patientName=" + patientName + ", dateLastModified=" + dateLastModified + ", dateRecorded=" + dateRecorded + ", enteredBy=" + enteredBy + ", enteredByIEN=" + enteredByIEN + ", status=" + status + ", acuity=" + acuity
				+ ", responsibleProviderIEN=" + responsibleProviderIEN + ", responsibleProvider=" + responsibleProvider + ", recordingProvider=" + recordingProvider + ", recordingProviderIEN=" + recordingProviderIEN + ", comments=" + comments + ", serviceConnected=" + serviceConnected + ", additionalProperties=" + additionalProperties + "]";
	}
	
	

}
