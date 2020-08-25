package com.opl.retail.api.model.loans_scoring;

/**
 * @author rahul.meena
 *
 */
public class ScalingMatrixRequest {
	
	
	private Long scoringModelId;
	private Long fpProductId;
	private Integer productType;
	private Long userId;
	private Integer productTab;
	
	private Double minItrThreeYearScore;
	private Double minItrLessThanThreeYearScore;
	private Double minItrPresumptiveScore;
	
	private Double maxItrThreeYearScore;
	private Double maxItrLessThanThreeYearScore;
	private Double maxItrPresumptiveScore;
	
	private Boolean isItrThreeYearScoreMandatory;
	private Boolean isItrLessThanThreeYearScoreMandatory;
	private Boolean isItrPresumptiveScoreMandatory;
	
	private Integer effectiveRoiBasedOn;  //scoringModelBasedOn
	
	// DROP DOWN Selection Scalling PL Type
	private Integer marginScaling;
	private Integer roiScaling;
	private Integer tenureScaling;
	private Integer pfScaling;
	
	//private List<ItrTypeWiseRiskGrading> itrTypeWiseRiskGradings;
	
	public Long getScoringModelId() {
		return scoringModelId;
	}
	public void setScoringModelId(Long scoringModelId) {
		this.scoringModelId = scoringModelId;
	}
	public Long getFpProductId() {
		return fpProductId;
	}
	public void setFpProductId(Long fpProductId) {
		this.fpProductId = fpProductId;
	}
	public Integer getProductType() {
		return productType;
	}
	public void setProductType(Integer productType) {
		this.productType = productType;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getProductTab() {
		return productTab;
	}
	public void setProductTab(Integer productTab) {
		this.productTab = productTab;
	}
	public Double getMinItrThreeYearScore() {
		return minItrThreeYearScore;
	}
	public void setMinItrThreeYearScore(Double minItrThreeYearScore) {
		this.minItrThreeYearScore = minItrThreeYearScore;
	}
	public Double getMinItrLessThanThreeYearScore() {
		return minItrLessThanThreeYearScore;
	}
	public void setMinItrLessThanThreeYearScore(Double minItrLessThanThreeYearScore) {
		this.minItrLessThanThreeYearScore = minItrLessThanThreeYearScore;
	}
	public Double getMinItrPresumptiveScore() {
		return minItrPresumptiveScore;
	}
	public void setMinItrPresumptiveScore(Double minItrPresumptiveScore) {
		this.minItrPresumptiveScore = minItrPresumptiveScore;
	}
	public Double getMaxItrThreeYearScore() {
		return maxItrThreeYearScore;
	}
	public void setMaxItrThreeYearScore(Double maxItrThreeYearScore) {
		this.maxItrThreeYearScore = maxItrThreeYearScore;
	}
	public Double getMaxItrLessThanThreeYearScore() {
		return maxItrLessThanThreeYearScore;
	}
	public void setMaxItrLessThanThreeYearScore(Double maxItrLessThanThreeYearScore) {
		this.maxItrLessThanThreeYearScore = maxItrLessThanThreeYearScore;
	}
	public Double getMaxItrPresumptiveScore() {
		return maxItrPresumptiveScore;
	}
	public void setMaxItrPresumptiveScore(Double maxItrPresumptiveScore) {
		this.maxItrPresumptiveScore = maxItrPresumptiveScore;
	}
	public Boolean getIsItrThreeYearScoreMandatory() {
		return isItrThreeYearScoreMandatory;
	}
	public void setIsItrThreeYearScoreMandatory(Boolean isItrThreeYearScoreMandatory) {
		this.isItrThreeYearScoreMandatory = isItrThreeYearScoreMandatory;
	}
	public Boolean getIsItrLessThanThreeYearScoreMandatory() {
		return isItrLessThanThreeYearScoreMandatory;
	}
	public void setIsItrLessThanThreeYearScoreMandatory(Boolean isItrLessThanThreeYearScoreMandatory) {
		this.isItrLessThanThreeYearScoreMandatory = isItrLessThanThreeYearScoreMandatory;
	}
	public Boolean getIsItrPresumptiveScoreMandatory() {
		return isItrPresumptiveScoreMandatory;
	}
	public void setIsItrPresumptiveScoreMandatory(Boolean isItrPresumptiveScoreMandatory) {
		this.isItrPresumptiveScoreMandatory = isItrPresumptiveScoreMandatory;
	}
	public Integer getEffectiveRoiBasedOn() {
		return effectiveRoiBasedOn;
	}
	public void setEffectiveRoiBasedOn(Integer effectiveRoiBasedOn) {
		this.effectiveRoiBasedOn = effectiveRoiBasedOn;
	}
	public Integer getMarginScaling() {
		return marginScaling;
	}
	public void setMarginScaling(Integer marginScaling) {
		this.marginScaling = marginScaling;
	}
	public Integer getRoiScaling() {
		return roiScaling;
	}
	public void setRoiScaling(Integer roiScaling) {
		this.roiScaling = roiScaling;
	}
	public Integer getTenureScaling() {
		return tenureScaling;
	}
	public void setTenureScaling(Integer tenureScaling) {
		this.tenureScaling = tenureScaling;
	}
	public Integer getPfScaling() {
		return pfScaling;
	}
	public void setPfScaling(Integer pfScaling) {
		this.pfScaling = pfScaling;
	}
	@Override
	public String toString() {
		return "ScalingMatrixRequest [scoringModelId=" + scoringModelId + ", fpProductId=" + fpProductId
				+ ", productType=" + productType + ", userId=" + userId + ", productTab=" + productTab
				+ ", minItrThreeYearScore=" + minItrThreeYearScore + ", minItrLessThanThreeYearScore="
				+ minItrLessThanThreeYearScore + ", minItrPresumptiveScore=" + minItrPresumptiveScore
				+ ", maxItrThreeYearScore=" + maxItrThreeYearScore + ", maxItrLessThanThreeYearScore="
				+ maxItrLessThanThreeYearScore + ", maxItrPresumptiveScore=" + maxItrPresumptiveScore
				+ ", isItrThreeYearScoreMandatory=" + isItrThreeYearScoreMandatory
				+ ", isItrLessThanThreeYearScoreMandatory=" + isItrLessThanThreeYearScoreMandatory
				+ ", isItrPresumptiveScoreMandatory=" + isItrPresumptiveScoreMandatory + ", effectiveRoiBasedOn="
				+ effectiveRoiBasedOn + ", marginScaling=" + marginScaling + ", roiScaling=" + roiScaling
				+ ", tenureScaling=" + tenureScaling + ", pfScaling=" + pfScaling + "]";
	}
}
