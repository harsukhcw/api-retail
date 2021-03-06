package com.opl.retail.api.model.cibil_integration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ScoreLogRequest extends BureauRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6032627760505326946L;

	private String score;
	private String scoreName;
	private String actualScore;
	private String pan;
	private Integer providerNew;

	public ScoreLogRequest() {
		super();
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getScoreName() {
		return scoreName;
	}

	public void setScoreName(String scoreName) {
		this.scoreName = scoreName;
	}

	public String getActualScore() {
		return actualScore;
	}

	public void setActualScore(String actualScore) {
		this.actualScore = actualScore;
	}

	public Integer getProviderNew() {
		return providerNew;
	}

	public void setProviderNew(Integer providerNew) {
		this.providerNew = providerNew;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "CibilScoreLogRequest [score=" + score + ", scoreName=" + scoreName + ", actualScore=" + actualScore
				+ ", providerNew=" + providerNew + ", getProvider()=" + getProvider() + "]";
	}
}
