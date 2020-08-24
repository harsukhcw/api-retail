package com.opl.retail.api.model.scoring_retail;

import java.util.List;

public class EmploymentTypeRequest {
	
	private Long id;
	
	private Integer employmentTypeId;
	
	private String employmentType;
	
	private Boolean isWeightConsider;
	
	private Boolean isProportionateScoreConsider;
	
	private Double proportionateScore;
	
	private Double totalScore;
	
	private List<RiskRequest> riskRequestList;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getEmploymentTypeId() {
		return employmentTypeId;
	}

	public void setEmploymentTypeId(Integer employmentTypeId) {
		this.employmentTypeId = employmentTypeId;
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

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	
	

	
	
	

}
