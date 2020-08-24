package com.opl.retail.api.model.scoring_retail;

import java.util.List;


public class RiskRequest {

	private Long id;
	private Integer itrTypeId;
	private String riskName;
	private Double riskWeight;
	private Double scoreWithRiskWeight;
	private Integer riskTypeId;
	private Integer numOfParameter;
	private Double totalMaxScore;
	private List<ModelParameterResponse> ModelParameterResponse;
	private List<FieldMasterRequest> FieldMasterRequestList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getItrTypeId() {
		return itrTypeId;
	}

	public void setItrTypeId(Integer itrTypeId) {
		this.itrTypeId = itrTypeId;
	}

	public String getRiskName() {
		return riskName;
	}

	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}

	public Double getRiskWeight() {
		return riskWeight;
	}

	public void setRiskWeight(Double riskWeight) {
		this.riskWeight = riskWeight;
	}

	public Double getScoreWithRiskWeight() {
		return scoreWithRiskWeight;
	}

	public void setScoreWithRiskWeight(Double scoreWithRiskWeight) {
		this.scoreWithRiskWeight = scoreWithRiskWeight;
	}

	public List<ModelParameterResponse> getModelParameterResponse() {
		return ModelParameterResponse;
	}

	public void setModelParameterResponse(List<ModelParameterResponse> modelParameterResponse) {
		ModelParameterResponse = modelParameterResponse;
	}

	public Integer getRiskTypeId() {
		return riskTypeId;
	}

	public void setRiskTypeId(Integer riskTypeId) {
		this.riskTypeId = riskTypeId;
	}

	public Integer getNumOfParameter() {
		return numOfParameter;
	}

	public void setNumOfParameter(Integer numOfParameter) {
		this.numOfParameter = numOfParameter;
	}

	public Double getTotalMaxScore() {
		return totalMaxScore;
	}

	public void setTotalMaxScore(Double totalMaxScore) {
		this.totalMaxScore = totalMaxScore;
	}
	

	public List<FieldMasterRequest> getFieldMasterRequestList() {
		return FieldMasterRequestList;
	}

	public void setFieldMasterRequestList(List<FieldMasterRequest> fieldMasterRequestList) {
		FieldMasterRequestList = fieldMasterRequestList;
	}

	@Override
	public String toString() {
		return "RiskMsmeRequest [id=" + id + ", itrTypeId=" + itrTypeId + ", riskName=" + riskName + ", riskWeight="
				+ riskWeight + ", scoreWithRiskWeight=" + scoreWithRiskWeight + ", riskTypeId=" + riskTypeId
				+ ", numOfParameter=" + numOfParameter + ", totalMaxScore=" + totalMaxScore
				+ ", ModelParameterResponse=" + ModelParameterResponse + ", FieldMasterRequestList="
				+ FieldMasterRequestList + "]";
	}

}
