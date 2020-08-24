package com.opl.retail.api.model.scoring_retail;

import java.util.List;

public class ModelParameterRequest {

	private Long id;

	private FieldMasterRequest fieldMasterRequest;

	private RiskRequest riskMsmeRequest;

	private List<ModelParameterOptionRequest> modelParameterOptions;

	private Double maxScore;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FieldMasterRequest getFieldMasterRequest() {
		return fieldMasterRequest;
	}

	public void setFieldMasterRequest(FieldMasterRequest fieldMasterRequest) {
		this.fieldMasterRequest = fieldMasterRequest;
	}

	public RiskRequest getRiskMsmeRequest() {
		return riskMsmeRequest;
	}

	public void setRiskMsmeRequest(RiskRequest riskMsmeRequest) {
		this.riskMsmeRequest = riskMsmeRequest;
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

	@Override
	public String toString() {
		return "ModelParameterRequest [id=" + id + ", fieldMasterRequest=" + fieldMasterRequest + ", riskMsmeRequest="
				+ riskMsmeRequest + ", modelParameterOptions=" + modelParameterOptions + ", maxScore=" + maxScore + "]";
	}

}
