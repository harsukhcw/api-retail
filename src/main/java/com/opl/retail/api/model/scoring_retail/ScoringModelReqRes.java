package com.opl.retail.api.model.scoring_retail;

import java.util.List;

public class ScoringModelReqRes {

	private Long id;

	private Long scoringModelTempId;

	private Integer status;

	private String message;

	private Long userId;

	private Long orgId;

	private Long fpProductId;

	private Long applicationId;

	private Integer scoringModelBasedOn;

	private Long scoringModelMasterId;

	private Long scoringModelId;

	private Long copyScoringModelId;

	private Long copyEmploymentTypeId;

	private String scoringModelName;

	private Long businessTypeId;

	private Double totalScore;

	/////////////////
	private List<RiskRequest> riskRequestList;
	private Integer employmentTypeId;

	private ScoringModelResponse scoringModelResponse;

	private List<ScoringModelResponse> scoringModelResponseList;

	private Object workFlowData;
	private List<Long> rolesList;
	private Boolean isEdit;
	private Long jobId;
	private Integer requestType;
	private Double minMargin;
	private Double maxMargin;

	private List<Long> scoringModelIdList;
	private Boolean isWeightConsider;
	private Boolean isProportionateScoreConsider;
	private Double proportionateScore;
	private List<Long> deletedGroupIds;
	private Boolean isSaveSendApproved;
	
	public ScoringModelReqRes() {}

	public ScoringModelReqRes(String message, Integer status) {
		super();
		this.status = status;
		this.message = message;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getScoringModelTempId() {
		return scoringModelTempId;
	}
	public void setScoringModelTempId(Long scoringModelTempId) {
		this.scoringModelTempId = scoringModelTempId;
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
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getOrgId() {
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	public Long getFpProductId() {
		return fpProductId;
	}
	public void setFpProductId(Long fpProductId) {
		this.fpProductId = fpProductId;
	}
	public Long getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
	public Integer getScoringModelBasedOn() {
		return scoringModelBasedOn;
	}
	public void setScoringModelBasedOn(Integer scoringModelBasedOn) {
		this.scoringModelBasedOn = scoringModelBasedOn;
	}
	public Long getScoringModelMasterId() {
		return scoringModelMasterId;
	}
	public void setScoringModelMasterId(Long scoringModelMasterId) {
		this.scoringModelMasterId = scoringModelMasterId;
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
	public Long getCopyEmploymentTypeId() {
		return copyEmploymentTypeId;
	}
	public void setCopyEmploymentTypeId(Long copyEmploymentTypeId) {
		this.copyEmploymentTypeId = copyEmploymentTypeId;
	}
	public String getScoringModelName() {
		return scoringModelName;
	}
	public void setScoringModelName(String scoringModelName) {
		this.scoringModelName = scoringModelName;
	}
	public Long getBusinessTypeId() {
		return businessTypeId;
	}
	public void setBusinessTypeId(Long businessTypeId) {
		this.businessTypeId = businessTypeId;
	}
	public Double getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(Double totalScore) {
		this.totalScore = totalScore;
	}
	
	public List<RiskRequest> getRiskRequestList() {
		return riskRequestList;
	}

	public void setRiskRequestList(List<RiskRequest> riskRequestList) {
		this.riskRequestList = riskRequestList;
	}

	public Integer getEmploymentTypeId() {
		return employmentTypeId;
	}

	public void setEmploymentTypeId(Integer employmentTypeId) {
		this.employmentTypeId = employmentTypeId;
	}

	public ScoringModelResponse getScoringModelResponse() {
		return scoringModelResponse;
	}
	public void setScoringModelResponse(ScoringModelResponse scoringModelResponse) {
		this.scoringModelResponse = scoringModelResponse;
	}
	public List<ScoringModelResponse> getScoringModelResponseList() {
		return scoringModelResponseList;
	}
	public void setScoringModelResponseList(List<ScoringModelResponse> scoringModelResponseList) {
		this.scoringModelResponseList = scoringModelResponseList;
	}
	public Object getWorkFlowData() {
		return workFlowData;
	}
	public void setWorkFlowData(Object workFlowData) {
		this.workFlowData = workFlowData;
	}
	public List<Long> getRolesList() {
		return rolesList;
	}
	public void setRolesList(List<Long> rolesList) {
		this.rolesList = rolesList;
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
	public Integer getRequestType() {
		return requestType;
	}
	public void setRequestType(Integer requestType) {
		this.requestType = requestType;
	}
	public Double getMinMargin() {
		return minMargin;
	}
	public void setMinMargin(Double minMargin) {
		this.minMargin = minMargin;
	}
	public Double getMaxMargin() {
		return maxMargin;
	}
	public void setMaxMargin(Double maxMargin) {
		this.maxMargin = maxMargin;
	}
	public List<Long> getScoringModelIdList() {
		return scoringModelIdList;
	}
	public void setScoringModelIdList(List<Long> scoringModelIdList) {
		this.scoringModelIdList = scoringModelIdList;
	}
	public Boolean getIsWeightConsider() {
		return isWeightConsider;
	}
	public void setIsWeightConsider(Boolean isWeightConsider) {
		this.isWeightConsider = isWeightConsider;
	}
	public Boolean getIsProportionateScoreConsider() {
		return isProportionateScoreConsider;
	}
	public void setIsProportionateScoreConsider(Boolean isProportionateScoreConsider) {
		this.isProportionateScoreConsider = isProportionateScoreConsider;
	}
	public Double getProportionateScore() {
		return proportionateScore;
	}
	public void setProportionateScore(Double proportionateScore) {
		this.proportionateScore = proportionateScore;
	}
	public List<Long> getDeletedGroupIds() {
		return deletedGroupIds;
	}
	public void setDeletedGroupIds(List<Long> deletedGroupIds) {
		this.deletedGroupIds = deletedGroupIds;
	}
	public Boolean getIsSaveSendApproved() {
		return isSaveSendApproved;
	}
	public void setIsSaveSendApproved(Boolean isSaveSendApproved) {
		this.isSaveSendApproved = isSaveSendApproved;
	}
	
	

}
