package com.opl.retail.api.model.scoring_retail;

import java.util.ArrayList;
import java.util.List;


public class ModelParameterResponse {

	private Long id;
	private Long fieldMasterId;
	private Long riskMakerId;
	private Double maxScore;
	private Integer versionId;
	private Integer incomeTypeId;;
	private Boolean isVersionDisplay;
	private Boolean isIncomeTypeDisplay;
	private List<ModelParameterOptionRequest> modelParameterOptions=new ArrayList<ModelParameterOptionRequest>();
	private List<FieldMasterRequest> FieldMasterRequestList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFieldMasterId() {
		return fieldMasterId;
	}

	public void setFieldMasterId(Long fieldMasterId) {
		this.fieldMasterId = fieldMasterId;
	}

	public Long getRiskMakerId() {
		return riskMakerId;
	}

	public void setRiskMakerId(Long riskMakerId) {
		this.riskMakerId = riskMakerId;
	}

	public Double getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(Double maxScore) {
		this.maxScore = maxScore;
	}

	public List<ModelParameterOptionRequest> getModelParameterOptions() {
		return modelParameterOptions;
	}

	public void setModelParameterOptions(List<ModelParameterOptionRequest> modelParameterOptions) {
		this.modelParameterOptions = modelParameterOptions;
	}

	public List<FieldMasterRequest> getFieldMasterRequestList() {
		return FieldMasterRequestList;
	}

	public void setFieldMasterRequestList(List<FieldMasterRequest> fieldMasterRequestList) {
		FieldMasterRequestList = fieldMasterRequestList;
	}

	public Integer getVersionId() {
		return versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}

	public Integer getIncomeTypeId() {
		return incomeTypeId;
	}

	public void setIncomeTypeId(Integer incomeTypeId) {
		this.incomeTypeId = incomeTypeId;
	}

	public Boolean getIsVersionDisplay() {
		return isVersionDisplay;
	}

	public void setIsVersionDisplay(Boolean isVersionDisplay) {
		this.isVersionDisplay = isVersionDisplay;
	}

	public Boolean getIsIncomeTypeDisplay() {
		return isIncomeTypeDisplay;
	}

	public void setIsIncomeTypeDisplay(Boolean isIncomeTypeDisplay) {
		this.isIncomeTypeDisplay = isIncomeTypeDisplay;
	}


}
