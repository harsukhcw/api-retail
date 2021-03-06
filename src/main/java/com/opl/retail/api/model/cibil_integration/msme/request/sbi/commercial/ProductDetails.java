package com.opl.retail.api.model.cibil_integration.msme.request.sbi.commercial;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"applicationId",
	"businessGroup",
	"circle",
	"productName",
	"applicantType",
	"loanAmount",
	"creditEnquiryPurpose",
	"terms",
	"frequency"
})
public class ProductDetails {

	@JsonProperty("applicationId")
	private String applicationId;
	@JsonProperty("businessGroup")
	private Integer businessGroup;
	@JsonProperty("circle")
	private Integer circle;
	@JsonProperty("productName")
	private String productName;
	@JsonProperty("applicantType")
	private String applicantType;
	@JsonProperty("loanAmount")
	private Integer loanAmount;
	@JsonProperty("creditEnquiryPurpose")
	private String creditEnquiryPurpose;
	@JsonProperty("terms")
	private Integer terms;
	@JsonProperty("frequency")
	private String frequency;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("applicationId")
	public String getApplicationId() {
		return applicationId;
	}

	@JsonProperty("applicationId")
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	@JsonProperty("businessGroup")
	public Integer getBusinessGroup() {
		return businessGroup;
	}

	@JsonProperty("businessGroup")
	public void setBusinessGroup(Integer businessGroup) {
		this.businessGroup = businessGroup;
	}

	@JsonProperty("circle")
	public Integer getCircle() {
		return circle;
	}

	@JsonProperty("circle")
	public void setCircle(Integer circle) {
		this.circle = circle;
	}

	@JsonProperty("productName")
	public String getProductName() {
		return productName;
	}

	@JsonProperty("productName")
	public void setProductName(String productName) {
		this.productName = productName;
	}

	@JsonProperty("applicantType")
	public String getApplicantType() {
		return applicantType;
	}

	@JsonProperty("applicantType")
	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}

	@JsonProperty("loanAmount")
	public Integer getLoanAmount() {
		return loanAmount;
	}

	@JsonProperty("loanAmount")
	public void setLoanAmount(Integer loanAmount) {
		this.loanAmount = loanAmount;
	}

	@JsonProperty("creditEnquiryPurpose")
	public String getCreditEnquiryPurpose() {
		return creditEnquiryPurpose;
	}

	@JsonProperty("creditEnquiryPurpose")
	public void setCreditEnquiryPurpose(String creditEnquiryPurpose) {
		this.creditEnquiryPurpose = creditEnquiryPurpose;
	}

	@JsonProperty("terms")
	public Integer getTerms() {
		return terms;
	}

	@JsonProperty("terms")
	public void setTerms(Integer terms) {
		this.terms = terms;
	}

	@JsonProperty("frequency")
	public String getFrequency() {
		return frequency;
	}

	@JsonProperty("frequency")
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}

