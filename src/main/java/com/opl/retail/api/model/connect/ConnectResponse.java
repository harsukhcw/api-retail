package com.opl.retail.api.model.connect;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConnectResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Boolean proceed = false;
	private Boolean stageProceed = false;
	private Integer stage;
	private Integer status;
	private String message;
	private Integer stepId;
	private Long applicationId;
	private Long userId;
	private Boolean isEligible;
	private String gstin;
	private String pan;
//	private String gstStatus;
	private String gstUserName;
	private Object data;
	private String error;
	private Integer businessTypeId;
	private Long branchId;
	private Long orgId;
	private Integer wcRenewalStatus;
	private Boolean otpVarified;
	private Boolean emailVarified;
	private Integer msmeType;
	private Boolean isCoApplicant;
	private Long loanTypeId;
	private Integer connectFlowTypeId;
	private Boolean isItrReturnFilled;
	private CommonMCQ commonMCQ;
	private List<?> dataList = Collections.emptyList();

	private Boolean isOldUser;
	private Boolean isFillAdditionalForm;
	private Integer connectStatus;
	private Boolean isNbfcUser;
	private Boolean isRelatedPartyFilled;
	private Boolean isProcessing;
	private Boolean isCoappPage;
	private Integer applicationStatus;
	private Date createdDate;
	private Date modifiedDate;
	private String stageValue;
	public ConnectResponse() {
		super();
	}

	public ConnectResponse(Boolean proceed, Integer stage, String message) {
		super();
		this.proceed = proceed;
		this.stage = stage;
		this.message = message;
	}

	public Boolean getIsNbfcUser() {
		return isNbfcUser;
	}

	public void setIsNbfcUser(Boolean nbfcUser) {
		isNbfcUser = nbfcUser;
	}

	public List<?> getDataList() {
		return dataList;
	}

	public void setDataList(List<?> dataList) {
		this.dataList = dataList;
	}

	public ConnectResponse(Boolean proceed, String message) {
		super();
		this.proceed = proceed;
		this.message = message;
	}

	public ConnectResponse(Boolean proceed,Object data ,String message) {
		super();
		this.proceed = proceed;
		this.data = data;
		this.message = message;
	}

	public ConnectResponse(Integer stage, Integer status, String message, Integer stepId) {
		super();
		this.stage = stage;
		this.status = status;
		this.message = message;
		this.stepId = stepId;
	}
	
	public ConnectResponse(Integer status, Object data, Long applicationId, Integer businessTypeId) {
		super();
		this.status = status;
		this.data = data;
		this.applicationId = applicationId;
		this.businessTypeId = businessTypeId;
	}

	public ConnectResponse(Boolean proceed,Boolean stageProceed, Integer stage, Integer status, String message, Integer stepId) {
		super();
		this.proceed = proceed;
		this.stage = stage;
		this.status = status;
		this.message = message;
		this.stepId = stepId;
		this.stageProceed=stageProceed;
	}
	
	public ConnectResponse(Boolean proceed, Integer stage, Integer status, String message, Integer stepId) {
		super();
		this.proceed = proceed;
		this.stage = stage;
		this.status = status;
		this.message = message;
		this.stepId = stepId;
	}

	public ConnectResponse(Boolean proceed, Integer status, String message, String error, Object data) {
		super();
		this.proceed = proceed;
		this.status = status;
		this.message = message;
		this.error = error;
		this.data = data;
	}

	public ConnectResponse(Boolean proceed, Integer stage, Integer status, String message, Integer stepId,
			Long applicationId, Long userId, Integer businessTypeId) {
		super();
		this.proceed = proceed;
		this.stage = stage;
		this.status = status;
		this.message = message;
		this.stepId = stepId;
		this.applicationId = applicationId;
		this.userId = userId;
		this.businessTypeId = businessTypeId;
	}

	public ConnectResponse(Boolean proceed, Integer stage, Integer status, String message, Integer stepId,
						   Long applicationId, Long userId, Integer businessTypeId,Long loanType) {
		super();
		this.proceed = proceed;
		this.stage = stage;
		this.status = status;
		this.message = message;
		this.stepId = stepId;
		this.applicationId = applicationId;
		this.userId = userId;
		this.businessTypeId = businessTypeId;
		this.loanTypeId = loanType;
	}
	public ConnectResponse(Boolean proceed, Integer stage, Integer status, String message, Integer stepId,Long applicationId, Long userId, Integer businessTypeId,Long loanType,Integer connectFlowTypeId) {
		super();
		this.proceed = proceed;
		this.stage = stage;
		this.status = status;
		this.message = message;
		this.stepId = stepId;
		this.applicationId = applicationId;
		this.userId = userId;
		this.businessTypeId = businessTypeId;
		this.loanTypeId = loanType;
		this.connectFlowTypeId=connectFlowTypeId;
	}

	public ConnectResponse(Boolean proceed, Integer stage, Integer status, String message, Integer stepId,
			Long applicationId, Long userId, Integer businessTypeId, Long branchId, Long orgId,
			Integer wcRenewalStatus) {
		super();
		this.proceed = proceed;
		this.stage = stage;
		this.status = status;
		this.message = message;
		this.stepId = stepId;
		this.applicationId = applicationId;
		this.userId = userId;
		this.businessTypeId = businessTypeId;
		this.branchId = branchId;
		this.orgId = orgId;
		this.wcRenewalStatus = wcRenewalStatus;
	}

	public ConnectResponse(String msg) {
		super();
		this.message=msg;
	}
	
	public Boolean getProceed() {
		return proceed;
	}

	public void setProceed(Boolean proceed) {
		this.proceed = proceed;
	}

	public Integer getStage() {
		return stage;
	}

	public void setStage(Integer stage) {
		this.stage = stage;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getStepId() {
		return stepId;
	}

	public void setStepId(Integer stepId) {
		this.stepId = stepId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Boolean getIsEligible() {
		return isEligible;
	}

	public void setIsEligible(Boolean isEligible) {
		this.isEligible = isEligible;
	}

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public String getGstUserName() {
		return gstUserName;
	}

	public void setGstUserName(String gstUserName) {
		this.gstUserName = gstUserName;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}

	public Integer getBusinessTypeId() {
		return businessTypeId;
	}

	public void setBusinessTypeId(Integer businessTypeId) {
		this.businessTypeId = businessTypeId;
	}

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Integer getWcRenewalStatus() {
		return wcRenewalStatus;
	}

	public void setWcRenewalStatus(Integer wcRenewalStatus) {
		this.wcRenewalStatus = wcRenewalStatus;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public Boolean isOtpVarified() {
		return otpVarified;
	}

	public void setOtpVarified(Boolean otpVarified) {
		this.otpVarified = otpVarified;
	}

	public Boolean isEmailVarified() {
		return emailVarified;
	}

	public void setEmailVarified(Boolean emailVarified) {
		this.emailVarified = emailVarified;
	}

	public Integer getMsmeType() {
		return msmeType;
	}

	public void setMsmeType(Integer msmeType) {
		this.msmeType = msmeType;
	}

	
	public CommonMCQ getCommonMCQ() {
		return commonMCQ;
	}

	public void setCommonMCQ(CommonMCQ commonMCQ) {
		this.commonMCQ = commonMCQ;
	}

	public Boolean getIsOldUser() {
		return isOldUser;
	}

	public void setIsOldUser(Boolean oldUser) {
		isOldUser = oldUser;
	}

	public Boolean getIsFillAdditionalForm() {
		return isFillAdditionalForm;
	}

	public void setIsFillAdditionalForm(Boolean fillAdditionalForm) {
		isFillAdditionalForm = fillAdditionalForm;
	}

	public Boolean getIsCoApplicant() {
		return isCoApplicant;
	}

	public void setIsCoApplicant(Boolean isCoApplicant) {
		this.isCoApplicant = isCoApplicant;
	}

	public Long getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(Long loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public Boolean getIsItrReturnFilled() {
		return isItrReturnFilled;
	}

	public void setIsItrReturnFilled(Boolean isItrReturnFilled) {
		this.isItrReturnFilled = isItrReturnFilled;
	}

	public Integer getConnectStatus() {
		return connectStatus;
	}

	public void setConnectStatus(Integer connectStatus) {
		this.connectStatus = connectStatus;
	}

	public Boolean getIsRelatedPartyFilled() {
		return isRelatedPartyFilled;
	}

	public void setIsRelatedPartyFilled(Boolean isRelatedPartyFilled) {
		this.isRelatedPartyFilled = isRelatedPartyFilled;
	}

	public Boolean getIsProcessing() {
		return isProcessing;
	}

	public void setIsProcessing(Boolean processing) {
		isProcessing = processing;
	}
	
	public Boolean getIsCoappPage() {
		return isCoappPage;
	}

	public void setIsCoappPage(Boolean isCoappPage) {
		this.isCoappPage = isCoappPage;
	}

	public Integer getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(Integer applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	
	public Boolean getStageProceed() {
		return stageProceed;
	}

	public void setStageProceed(Boolean stageProceed) {
		this.stageProceed = stageProceed;
	}

	public Integer getConnectFlowTypeId() {
		return connectFlowTypeId;
	}

	public void setConnectFlowTypeId(Integer connectFlowTypeId) {
		this.connectFlowTypeId = connectFlowTypeId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getStageValue() {
		return stageValue;
	}

	public void setStageValue(String stageValue) {
		this.stageValue = stageValue;
	}

	@Override
	public String toString() {
		return "ConnectResponse{" +
				"proceed=" + proceed +
				", stageProceed=" + stageProceed +
				", stage=" + stage +
				", status=" + status +
				", message='" + message + '\'' +
				", stepId=" + stepId +
				", applicationId=" + applicationId +
				", userId=" + userId +
				", isEligible=" + isEligible +
				", gstin='" + gstin + '\'' +
				", pan='" + pan + '\'' +
				", gstUserName='" + gstUserName + '\'' +
				", data=" + data +
				", error='" + error + '\'' +
				", businessTypeId=" + businessTypeId +
				", branchId=" + branchId +
				", orgId=" + orgId +
				", wcRenewalStatus=" + wcRenewalStatus +
				", otpVarified=" + otpVarified +
				", emailVarified=" + emailVarified +
				", msmeType=" + msmeType +
				", isCoApplicant=" + isCoApplicant +
				", loanTypeId=" + loanTypeId +
				", connectFlowTypeId=" + connectFlowTypeId +
				", isItrReturnFilled=" + isItrReturnFilled +
				", commonMCQ=" + commonMCQ +
				", dataList=" + dataList +
				", isOldUser=" + isOldUser +
				", isFillAdditionalForm=" + isFillAdditionalForm +
				", connectStatus=" + connectStatus +
				", isNbfcUser=" + isNbfcUser +
				", isRelatedPartyFilled=" + isRelatedPartyFilled +
				", isProcessing=" + isProcessing +
				", isCoappPage=" + isCoappPage +
				", applicationStatus=" + applicationStatus +
				'}';
	}
}
