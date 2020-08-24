package com.opl.retail.api.model.scoring_retail;

public class ModelParameterOptionRequest {

	private Long id;
	
	private Double minScore;
	
	private Double maxScore;
	
	private Long value;
	
	private String code;
	
	private Double score;
	
	private String description;
	
    private Boolean isActive;
    
    private Integer type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getMinScore() {
		return minScore;
	}

	public void setMinScore(Double minScore) {
		this.minScore = minScore;
	}

	public Double getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(Double maxScore) {
		this.maxScore = maxScore;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ModelParameterOptionRequest [id=" + id + ", minScore=" + minScore + ", maxScore=" + maxScore
				+ ", value=" + value + ", code=" + code + ", score=" + score + ", description=" + description
				+ ", isActive=" + isActive + ", type=" + type + "]";
	}
	
	
}
