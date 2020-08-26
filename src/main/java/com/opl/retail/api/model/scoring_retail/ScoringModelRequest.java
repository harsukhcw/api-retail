package com.opl.retail.api.model.scoring_retail;

import java.util.Date;
import java.util.List;

public class ScoringModelRequest {

	private Long id;

	private String name;

	private String code;

	private Integer employmentTypeId;
	
	private Boolean isConsiderCoApp;
	
	private Boolean isConsiderApp;
	
	private Boolean isSalaried;
	
	private Boolean isNonSalaried;

	private Boolean isApproved;

	private Date approvalDate;

	private Boolean isCopied;

	private Boolean isEdit;

	private Long jobId;

	private Long orgId;

	private Integer statusId;

	private Float version;

	private Date modifiedDate;

	private Long userRoleId;

	private Long removeJobId;

	private List<EmploymentTypeRequest> employmentTypeRequestList;

	private Long userId;

	private Integer status;

	private String message;

	private Integer businessTypeId;

	private Long scoringModelId;
	
	private Long copyScoringModelId;
	
	private Boolean isMaker;
	
	private Boolean isActive;
	
	private String requestType;
	
	private String reason;
	
	private String checkerDecision;
	
	private Integer copyFromEmploymentTypeId;
	
	private Long parentScoringModelCheckerId;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getEmploymentTypeId() {
		return employmentTypeId;
	}

	public void setEmploymentTypeId(Integer employmentTypeId) {
		this.employmentTypeId = employmentTypeId;
	}

	public Boolean getIsConsiderCoApp() {
		return isConsiderCoApp;
	}

	public void setIsConsiderCoApp(Boolean isConsiderCoApp) {
		this.isConsiderCoApp = isConsiderCoApp;
	}

	public Boolean getIsConsiderApp() {
		return isConsiderApp;
	}

	public void setIsConsiderApp(Boolean isConsiderApp) {
		this.isConsiderApp = isConsiderApp;
	}

	public Boolean getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
	}

	public Date getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}

	public Boolean getIsCopied() {
		return isCopied;
	}

	public void setIsCopied(Boolean isCopied) {
		this.isCopied = isCopied;
	}

	public Boolean getIsEdit() {
		return isEdit;
	}

	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public Float getVersion() {
		return version;
	}

	public void setVersion(Float version) {
		this.version = version;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Long getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}

	public Long getRemoveJobId() {
		return removeJobId;
	}

	public void setRemoveJobId(Long removeJobId) {
		this.removeJobId = removeJobId;
	}

	public List<EmploymentTypeRequest> getEmploymentTypeRequestList() {
		return employmentTypeRequestList;
	}

	public void setEmploymentTypeRequestList(List<EmploymentTypeRequest> employmentTypeRequestList) {
		this.employmentTypeRequestList = employmentTypeRequestList;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public Integer getBusinessTypeId() {
		return businessTypeId;
	}

	public void setBusinessTypeId(Integer businessTypeId) {
		this.businessTypeId = businessTypeId;
	}

	public Long getScoringModelId() {
		return scoringModelId;
	}

	public void setScoringModelId(Long scoringModelId) {
		this.scoringModelId = scoringModelId;
	}

	public Long getCopyScoringModelId() {
		return copyScoringModelId;
	}

	public void setCopyScoringModelId(Long copyScoringModelId) {
		this.copyScoringModelId = copyScoringModelId;
	}

	public Boolean getIsMaker() {
		return isMaker;
	}

	public void setIsMaker(Boolean isMaker) {
		this.isMaker = isMaker;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getCheckerDecision() {
		return checkerDecision;
	}

	public void setCheckerDecision(String checkerDecision) {
		this.checkerDecision = checkerDecision;
	}

	public Integer getCopyFromEmploymentTypeId() {
		return copyFromEmploymentTypeId;
	}

	public void setCopyFromEmploymentTypeId(Integer copyFromEmploymentTypeId) {
		this.copyFromEmploymentTypeId = copyFromEmploymentTypeId;
	}

	public Boolean getIsSalaried() {
		return isSalaried;
	}

	public void setIsSalaried(Boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	public Boolean getIsNonSalaried() {
		return isNonSalaried;
	}

	public void setIsNonSalaried(Boolean isNonSalaried) {
		this.isNonSalaried = isNonSalaried;
	}

	public Long getParentScoringModelCheckerId() {
		return parentScoringModelCheckerId;
	}

	public void setParentScoringModelCheckerId(Long parentScoringModelCheckerId) {
		this.parentScoringModelCheckerId = parentScoringModelCheckerId;
	}
	

	

}
