package com.opl.retail.api.model.loans.retail;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.opl.retail.api.model.loans.DataRequest;
import com.opl.retail.api.model.loans.ProductMasterRequest;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RetailProduct extends ProductMasterRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3041203910477155624L;

	private Long fpProductId;

	private Integer currency;

	private Boolean isAgeDisplay = false;

	private Boolean isAgeMandatory = false;

	private Boolean isAssetValueDisplay = false;

	private Boolean isAssetValueMandatory = false;

	private Boolean isGeographicalDisplay = false;

	private Boolean isGeographicalMandatory = false;

	private Boolean isLoanAmountDisplay = false;

	private Boolean isLoanAmountMandatory = false;

	private Boolean isTenureDisplay = false;

	private Boolean isTenureMandatory = false;

	private Boolean isYearlyIncomeRangeDisplay = false;

	private Boolean isYearlyIncomeRangeMandatory = false;

	private Double maxAge;

	private Double maxAssetValue;

	private Double maxLoanAmount;

	private Double maxTenure;

	private Double maxYearlyIncomeRange;

	private Double minAge;

	private Double minAssetValue;

	private Double minLoanAmount;

	private Double minTenure;

	private Double minYearlyIncomeRange;

	private List<DataRequest> countryList = Collections.emptyList();

	private List<DataRequest> stateList = Collections.emptyList();

	private List<DataRequest> cityList = Collections.emptyList();

	private Double minMonthlyIncomeRange;

	private Double maxMonthlyIncomeRange;

	private Boolean isMonthlyIncomeRangeDisplay= false;

	private Boolean isMonthlyIncomeRangeMandatory= false;
	
	private Boolean isGrossIncomeRangeDisplay= false;

	private Boolean isGrossIncomeRangeMandatory= false;
	
	private Double maxGrossIncomeRange;

	private Double minGrossIncomeRange;

	private Double minBureauScore;

	private Double maxBureauScore;
	
	//Less Than 6 month of Credit History
	private Integer minBureauScoreLessThan6Month;
	
	//No Credit History
	private Boolean noBureauCreditHistory = true;

	private Boolean isBureauScoreDisplay= false;

	private Boolean isBureauScoreMandatory= false;

	private Double minBureauScoreDays;

	private Double maxBureauScoreDays;

	private Boolean isBureauScoreDaysDisplay= false;

	private Boolean isBureauScoreDaysMandatory= false;

	private Double minRiskScoreRetail;

	private Double maxRiskScoreRetail;

	private Boolean isRiskScoreRetailDisplay= false;

	private Boolean isRiskScoreRetailMandatory= false;
	
	//Risk Model For Other than Salaried
	private Double minRiskScoreRetailOthThnSal;
	private Boolean isRiskScoreRetailOthThnSalDisplay=true;
	private Boolean isRiskScoreRetailOthThnSalMandatory=true;
	
	private Double minRiskScoreModelCoAppOthThnSal;
	private Boolean isRiskScoreRetailCoAppOthThnSalDisplay=true;
	private Boolean isRiskScoreRetailCoAppOthThnSalMandatory=true;
	private Boolean isCoAppOthThnSalIncomeForEligibilityCalc=true;

	private List<Integer> empWithIds;
	
	private Boolean isEmpWithDisplay= false;

	private Boolean isEmpWithMandatory= false;
	
	private Boolean isEmpRatingDisplay= false;

	private Boolean isEmpRatingMandatory= false;

	private Double minTotalJobExp;

	private Double maxTotalJobExp;

	private Boolean isTotalJobExpDisplay= false;

	private Boolean isTotalJobExpMandatory= false;
	
	private Double minTotalCurrentJobExp;

	private Double maxTotalCurrentJobExp;

	private Boolean isTotalCurrentJobExpDisplay= false;

	private Boolean isTotalCurrentJobExpMandatory= false;
	
	private List<Integer> empStatusIds;
	
	private Boolean isEmpStatusDisplay= false;

	private Boolean isEmpStatusMandatory= false;
	
	private List<CreditRatingPlParameter> creditRatingSelectedList;
	
	private Long userOrgId;
	
	private Integer userCreditRating;
	
	private Boolean isBankingRelationMandatory= false;

	private Boolean isBankingRelationDisplay= false;
	
	private Double minBankRelation;

	private Double maxBankRelation;

	private List<Integer> salaryModeIds;
	
	private Boolean isSalaryModeDisplay= false;

	private Boolean isSalaryModeMandatory= false;
	
	private Boolean isSalaryAcTypeDisplay= false;

	private Boolean isSalaryAcTypeMandatory= false;
	
	private Integer salaryAcType;
	
	private Integer assessmentMethodId;
	
	private List<EmiNmiDetailRequest> emiNmiDetailRequestList;
	
	
	
	private Boolean isBasedOnIncome = false;
	
	private Boolean isMultiplierOfIncomeCheck = false;

	private Integer multiplierOfIncomeCheck;
	
	private Boolean isEmiNmiCheck = false;

	private BigDecimal emiNmiCheck;
	
	private Integer basedOnIncomeType;
	
	private Integer multiplierIncomeType;
	
	private Integer basedOnType;
	
	private Integer bureauVersion;
	
	// Minimum Net Take Home Salary (Rs.): 
	private Double minNetTakeHomeSalary;
	private Boolean isMinNetTakeHomeSalaryDisplay = false;
	private Boolean isMinNetTakeHomeSalaryMandatory = false;
	
	private Integer campaignCode;
	
	private Double stdIncrementalPercentage;
	 
	private Integer maxRetirementAge;
	
	private Boolean isAllowAmtPastDue = false;
	private Boolean isAllowSuitFiled = false;

//	Do You want to consider EMI of Borrower who is acting as a Guarantor/ Authorized User for Loan Eligibility calculation?
	private Boolean isEmiForEligibilityCalc = false;
	
	private String salAcType;
	
	private Boolean isSalAcTypeDisplay = false;
	
	private Boolean isSalAcTypeMandatory = false;
	
	private List<Integer> bureauScoreIds = Collections.emptyList();
	

	public Long getFpProductId() {
		return fpProductId;
	}

	public void setFpProductId(Long fpProductId) {
		this.fpProductId = fpProductId;
	}

	public Integer getCurrency() {
		return currency;
	}

	public void setCurrency(Integer currency) {
		this.currency = currency;
	}

	public Boolean getIsAgeDisplay() {
		return isAgeDisplay;
	}

	public void setIsAgeDisplay(Boolean isAgeDisplay) {
		this.isAgeDisplay = isAgeDisplay;
	}

	public Boolean getIsAgeMandatory() {
		return isAgeMandatory;
	}

	public void setIsAgeMandatory(Boolean isAgeMandatory) {
		this.isAgeMandatory = isAgeMandatory;
	}

	public Boolean getIsAssetValueDisplay() {
		return isAssetValueDisplay;
	}

	public void setIsAssetValueDisplay(Boolean isAssetValueDisplay) {
		this.isAssetValueDisplay = isAssetValueDisplay;
	}

	public Boolean getIsAssetValueMandatory() {
		return isAssetValueMandatory;
	}

	public void setIsAssetValueMandatory(Boolean isAssetValueMandatory) {
		this.isAssetValueMandatory = isAssetValueMandatory;
	}

	public Boolean getIsGeographicalDisplay() {
		return isGeographicalDisplay;
	}

	public void setIsGeographicalDisplay(Boolean isGeographicalDisplay) {
		this.isGeographicalDisplay = isGeographicalDisplay;
	}

	public Boolean getIsGeographicalMandatory() {
		return isGeographicalMandatory;
	}

	public void setIsGeographicalMandatory(Boolean isGeographicalMandatory) {
		this.isGeographicalMandatory = isGeographicalMandatory;
	}

	public Boolean getIsLoanAmountDisplay() {
		return isLoanAmountDisplay;
	}

	public void setIsLoanAmountDisplay(Boolean isLoanAmountDisplay) {
		this.isLoanAmountDisplay = isLoanAmountDisplay;
	}

	public Boolean getIsLoanAmountMandatory() {
		return isLoanAmountMandatory;
	}

	public void setIsLoanAmountMandatory(Boolean isLoanAmountMandatory) {
		this.isLoanAmountMandatory = isLoanAmountMandatory;
	}

	public Boolean getIsTenureDisplay() {
		return isTenureDisplay;
	}

	public void setIsTenureDisplay(Boolean isTenureDisplay) {
		this.isTenureDisplay = isTenureDisplay;
	}

	public Boolean getIsTenureMandatory() {
		return isTenureMandatory;
	}

	public void setIsTenureMandatory(Boolean isTenureMandatory) {
		this.isTenureMandatory = isTenureMandatory;
	}

	public Boolean getIsYearlyIncomeRangeDisplay() {
		return isYearlyIncomeRangeDisplay;
	}

	public void setIsYearlyIncomeRangeDisplay(Boolean isYearlyIncomeRangeDisplay) {
		this.isYearlyIncomeRangeDisplay = isYearlyIncomeRangeDisplay;
	}

	public Boolean getIsYearlyIncomeRangeMandatory() {
		return isYearlyIncomeRangeMandatory;
	}

	public void setIsYearlyIncomeRangeMandatory(Boolean isYearlyIncomeRangeMandatory) {
		this.isYearlyIncomeRangeMandatory = isYearlyIncomeRangeMandatory;
	}

	public Double getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Double maxAge) {
		this.maxAge = maxAge;
	}

	public Double getMaxAssetValue() {
		return maxAssetValue;
	}

	public void setMaxAssetValue(Double maxAssetValue) {
		this.maxAssetValue = maxAssetValue;
	}

	public Double getMaxLoanAmount() {
		return maxLoanAmount;
	}

	public void setMaxLoanAmount(Double maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}

	public Double getMaxTenure() {
		return maxTenure;
	}

	public void setMaxTenure(Double maxTenure) {
		this.maxTenure = maxTenure;
	}

	public Double getMaxYearlyIncomeRange() {
		return maxYearlyIncomeRange;
	}

	public void setMaxYearlyIncomeRange(Double maxYearlyIncomeRange) {
		this.maxYearlyIncomeRange = maxYearlyIncomeRange;
	}

	public Double getMinAge() {
		return minAge;
	}

	public void setMinAge(Double minAge) {
		this.minAge = minAge;
	}

	public Double getMinAssetValue() {
		return minAssetValue;
	}

	public void setMinAssetValue(Double minAssetValue) {
		this.minAssetValue = minAssetValue;
	}

	public Double getMinLoanAmount() {
		return minLoanAmount;
	}

	public void setMinLoanAmount(Double minLoanAmount) {
		this.minLoanAmount = minLoanAmount;
	}

	public Double getMinTenure() {
		return minTenure;
	}

	public void setMinTenure(Double minTenure) {
		this.minTenure = minTenure;
	}

	public Double getMinYearlyIncomeRange() {
		return minYearlyIncomeRange;
	}

	public void setMinYearlyIncomeRange(Double minYearlyIncomeRange) {
		this.minYearlyIncomeRange = minYearlyIncomeRange;
	}

	public List<DataRequest> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<DataRequest> countryList) {
		this.countryList = countryList;
	}

	public List<DataRequest> getStateList() {
		return stateList;
	}

	public void setStateList(List<DataRequest> stateList) {
		this.stateList = stateList;
	}

	public List<DataRequest> getCityList() {
		return cityList;
	}

	public void setCityList(List<DataRequest> cityList) {
		this.cityList = cityList;
	}

	public Double getMinMonthlyIncomeRange() {
		return minMonthlyIncomeRange;
	}

	public void setMinMonthlyIncomeRange(Double minMonthlyIncomeRange) {
		this.minMonthlyIncomeRange = minMonthlyIncomeRange;
	}

	public Double getMaxMonthlyIncomeRange() {
		return maxMonthlyIncomeRange;
	}

	public void setMaxMonthlyIncomeRange(Double maxMonthlyIncomeRange) {
		this.maxMonthlyIncomeRange = maxMonthlyIncomeRange;
	}

	public Boolean getIsMonthlyIncomeRangeDisplay() {
		return isMonthlyIncomeRangeDisplay;
	}

	public void setIsMonthlyIncomeRangeDisplay(Boolean isMonthlyIncomeRangeDisplay) {
		this.isMonthlyIncomeRangeDisplay = isMonthlyIncomeRangeDisplay;
	}

	public Boolean getIsMonthlyIncomeRangeMandatory() {
		return isMonthlyIncomeRangeMandatory;
	}

	public void setIsMonthlyIncomeRangeMandatory(Boolean isMonthlyIncomeRangeMandatory) {
		this.isMonthlyIncomeRangeMandatory = isMonthlyIncomeRangeMandatory;
	}

	public Double getMinBureauScore() {
		return minBureauScore;
	}

	public void setMinBureauScore(Double minBureauScore) {
		this.minBureauScore = minBureauScore;
	}

	public Double getMaxBureauScore() {
		return maxBureauScore;
	}

	public void setMaxBureauScore(Double maxBureauScore) {
		this.maxBureauScore = maxBureauScore;
	}

	public Boolean getIsBureauScoreDisplay() {
		return isBureauScoreDisplay;
	}

	public void setIsBureauScoreDisplay(Boolean isBureauScoreDisplay) {
		this.isBureauScoreDisplay = isBureauScoreDisplay;
	}

	public Boolean getIsBureauScoreMandatory() {
		return isBureauScoreMandatory;
	}

	public void setIsBureauScoreMandatory(Boolean isBureauScoreMandatory) {
		this.isBureauScoreMandatory = isBureauScoreMandatory;
	}

	public Double getMinBureauScoreDays() {
		return minBureauScoreDays;
	}

	public void setMinBureauScoreDays(Double minBureauScoreDays) {
		this.minBureauScoreDays = minBureauScoreDays;
	}

	public Double getMaxBureauScoreDays() {
		return maxBureauScoreDays;
	}

	public void setMaxBureauScoreDays(Double maxBureauScoreDays) {
		this.maxBureauScoreDays = maxBureauScoreDays;
	}

	public Boolean getIsBureauScoreDaysDisplay() {
		return isBureauScoreDaysDisplay;
	}

	public void setIsBureauScoreDaysDisplay(Boolean isBureauScoreDaysDisplay) {
		this.isBureauScoreDaysDisplay = isBureauScoreDaysDisplay;
	}

	public Boolean getIsBureauScoreDaysMandatory() {
		return isBureauScoreDaysMandatory;
	}

	public void setIsBureauScoreDaysMandatory(Boolean isBureauScoreDaysMandatory) {
		this.isBureauScoreDaysMandatory = isBureauScoreDaysMandatory;
	}

	public Double getMinRiskScoreRetail() {
		return minRiskScoreRetail;
	}

	public void setMinRiskScoreRetail(Double minRiskScoreRetail) {
		this.minRiskScoreRetail = minRiskScoreRetail;
	}

	public Double getMaxRiskScoreRetail() {
		return maxRiskScoreRetail;
	}

	public void setMaxRiskScoreRetail(Double maxRiskScoreRetail) {
		this.maxRiskScoreRetail = maxRiskScoreRetail;
	}

	public Boolean getIsRiskScoreRetailDisplay() {
		return isRiskScoreRetailDisplay;
	}

	public void setIsRiskScoreRetailDisplay(Boolean isRiskScoreRetailDisplay) {
		this.isRiskScoreRetailDisplay = isRiskScoreRetailDisplay;
	}

	public Boolean getIsRiskScoreRetailMandatory() {
		return isRiskScoreRetailMandatory;
	}

	public void setIsRiskScoreRetailMandatory(Boolean isRiskScoreRetailMandatory) {
		this.isRiskScoreRetailMandatory = isRiskScoreRetailMandatory;
	}

	public List<Integer> getEmpWithIds() {
		return empWithIds;
	}

	public void setEmpWithIds(List<Integer> empWithIds) {
		this.empWithIds = empWithIds;
	}

	public Boolean getIsEmpWithDisplay() {
		return isEmpWithDisplay;
	}

	public void setIsEmpWithDisplay(Boolean isEmpWithDisplay) {
		this.isEmpWithDisplay = isEmpWithDisplay;
	}

	public Boolean getIsEmpWithMandatory() {
		return isEmpWithMandatory;
	}

	public void setIsEmpWithMandatory(Boolean isEmpWithMandatory) {
		this.isEmpWithMandatory = isEmpWithMandatory;
	}

	public Boolean getIsEmpRatingDisplay() {
		return isEmpRatingDisplay;
	}

	public void setIsEmpRatingDisplay(Boolean isEmpRatingDisplay) {
		this.isEmpRatingDisplay = isEmpRatingDisplay;
	}

	public Boolean getIsEmpRatingMandatory() {
		return isEmpRatingMandatory;
	}

	public void setIsEmpRatingMandatory(Boolean isEmpRatingMandatory) {
		this.isEmpRatingMandatory = isEmpRatingMandatory;
	}

	public Double getMinTotalJobExp() {
		return minTotalJobExp;
	}

	public void setMinTotalJobExp(Double minTotalJobExp) {
		this.minTotalJobExp = minTotalJobExp;
	}

	public Double getMaxTotalJobExp() {
		return maxTotalJobExp;
	}

	public void setMaxTotalJobExp(Double maxTotalJobExp) {
		this.maxTotalJobExp = maxTotalJobExp;
	}

	public Boolean getIsTotalJobExpDisplay() {
		return isTotalJobExpDisplay;
	}

	public void setIsTotalJobExpDisplay(Boolean isTotalJobExpDisplay) {
		this.isTotalJobExpDisplay = isTotalJobExpDisplay;
	}

	public Boolean getIsTotalJobExpMandatory() {
		return isTotalJobExpMandatory;
	}

	public void setIsTotalJobExpMandatory(Boolean isTotalJobExpMandatory) {
		this.isTotalJobExpMandatory = isTotalJobExpMandatory;
	}

	public Double getMinTotalCurrentJobExp() {
		return minTotalCurrentJobExp;
	}

	public void setMinTotalCurrentJobExp(Double minTotalCurrentJobExp) {
		this.minTotalCurrentJobExp = minTotalCurrentJobExp;
	}

	public Double getMaxTotalCurrentJobExp() {
		return maxTotalCurrentJobExp;
	}

	public void setMaxTotalCurrentJobExp(Double maxTotalCurrentJobExp) {
		this.maxTotalCurrentJobExp = maxTotalCurrentJobExp;
	}

	public Boolean getIsTotalCurrentJobExpDisplay() {
		return isTotalCurrentJobExpDisplay;
	}

	public void setIsTotalCurrentJobExpDisplay(Boolean isTotalCurrentJobExpDisplay) {
		this.isTotalCurrentJobExpDisplay = isTotalCurrentJobExpDisplay;
	}

	public Boolean getIsTotalCurrentJobExpMandatory() {
		return isTotalCurrentJobExpMandatory;
	}

	public void setIsTotalCurrentJobExpMandatory(Boolean isTotalCurrentJobExpMandatory) {
		this.isTotalCurrentJobExpMandatory = isTotalCurrentJobExpMandatory;
	}

	public List<Integer> getEmpStatusIds() {
		return empStatusIds;
	}

	public void setEmpStatusIds(List<Integer> empStatusIds) {
		this.empStatusIds = empStatusIds;
	}

	public Boolean getIsEmpStatusDisplay() {
		return isEmpStatusDisplay;
	}

	public void setIsEmpStatusDisplay(Boolean isEmpStatusDisplay) {
		this.isEmpStatusDisplay = isEmpStatusDisplay;
	}

	public Boolean getIsEmpStatusMandatory() {
		return isEmpStatusMandatory;
	}

	public void setIsEmpStatusMandatory(Boolean isEmpStatusMandatory) {
		this.isEmpStatusMandatory = isEmpStatusMandatory;
	}

	public List<CreditRatingPlParameter> getCreditRatingSelectedList() {
		return creditRatingSelectedList;
	}

	public void setCreditRatingSelectedList(List<CreditRatingPlParameter> creditRatingSelectedList) {
		this.creditRatingSelectedList = creditRatingSelectedList;
	}

	public Long getUserOrgId() {
		return userOrgId;
	}

	public void setUserOrgId(Long userOrgId) {
		this.userOrgId = userOrgId;
	}

	public Integer getUserCreditRating() {
		return userCreditRating;
	}

	public void setUserCreditRating(Integer userCreditRating) {
		this.userCreditRating = userCreditRating;
	}

	public Boolean getIsBankingRelationMandatory() {
		return isBankingRelationMandatory;
	}

	public void setIsBankingRelationMandatory(Boolean isBankingRelationMandatory) {
		this.isBankingRelationMandatory = isBankingRelationMandatory;
	}

	public Boolean getIsBankingRelationDisplay() {
		return isBankingRelationDisplay;
	}

	public void setIsBankingRelationDisplay(Boolean isBankingRelationDisplay) {
		this.isBankingRelationDisplay = isBankingRelationDisplay;
	}

	public Double getMinBankRelation() {
		return minBankRelation;
	}

	public void setMinBankRelation(Double minBankRelation) {
		this.minBankRelation = minBankRelation;
	}

	public Double getMaxBankRelation() {
		return maxBankRelation;
	}

	public void setMaxBankRelation(Double maxBankRelation) {
		this.maxBankRelation = maxBankRelation;
	}

	public List<Integer> getSalaryModeIds() {
		return salaryModeIds;
	}

	public void setSalaryModeIds(List<Integer> salaryModeIds) {
		this.salaryModeIds = salaryModeIds;
	}

	public Boolean getIsSalaryModeDisplay() {
		return isSalaryModeDisplay;
	}

	public void setIsSalaryModeDisplay(Boolean isSalaryModeDisplay) {
		this.isSalaryModeDisplay = isSalaryModeDisplay;
	}

	public Boolean getIsSalaryModeMandatory() {
		return isSalaryModeMandatory;
	}

	public void setIsSalaryModeMandatory(Boolean isSalaryModeMandatory) {
		this.isSalaryModeMandatory = isSalaryModeMandatory;
	}

	public Boolean getIsSalaryAcTypeDisplay() {
		return isSalaryAcTypeDisplay;
	}

	public void setIsSalaryAcTypeDisplay(Boolean isSalaryAcTypeDisplay) {
		this.isSalaryAcTypeDisplay = isSalaryAcTypeDisplay;
	}

	public Boolean getIsSalaryAcTypeMandatory() {
		return isSalaryAcTypeMandatory;
	}

	public void setIsSalaryAcTypeMandatory(Boolean isSalaryAcTypeMandatory) {
		this.isSalaryAcTypeMandatory = isSalaryAcTypeMandatory;
	}

	public Integer getSalaryAcType() {
		return salaryAcType;
	}

	public void setSalaryAcType(Integer salaryAcType) {
		this.salaryAcType = salaryAcType;
	}

	public Integer getAssessmentMethodId() {
		return assessmentMethodId;
	}

	public void setAssessmentMethodId(Integer assessmentMethodId) {
		this.assessmentMethodId = assessmentMethodId;
	}

	public Boolean getIsBasedOnIncome() {
		return isBasedOnIncome;
	}

	public void setIsBasedOnIncome(Boolean isBasedOnIncome) {
		this.isBasedOnIncome = isBasedOnIncome;
	}

	public Boolean getIsMultiplierOfIncomeCheck() {
		return isMultiplierOfIncomeCheck;
	}

	public void setIsMultiplierOfIncomeCheck(Boolean isMultiplierOfIncomeCheck) {
		this.isMultiplierOfIncomeCheck = isMultiplierOfIncomeCheck;
	}

	public Integer getMultiplierOfIncomeCheck() {
		return multiplierOfIncomeCheck;
	}

	public void setMultiplierOfIncomeCheck(Integer multiplierOfIncomeCheck) {
		this.multiplierOfIncomeCheck = multiplierOfIncomeCheck;
	}

	public Boolean getIsEmiNmiCheck() {
		return isEmiNmiCheck;
	}

	public void setIsEmiNmiCheck(Boolean isEmiNmiCheck) {
		this.isEmiNmiCheck = isEmiNmiCheck;
	}

	public BigDecimal getEmiNmiCheck() {
		return emiNmiCheck;
	}

	public void setEmiNmiCheck(BigDecimal emiNmiCheck) {
		this.emiNmiCheck = emiNmiCheck;
	}

	public Boolean getIsGrossIncomeRangeDisplay() {
		return isGrossIncomeRangeDisplay;
	}

	public void setIsGrossIncomeRangeDisplay(Boolean isGrossIncomeRangeDisplay) {
		this.isGrossIncomeRangeDisplay = isGrossIncomeRangeDisplay;
	}

	public Boolean getIsGrossIncomeRangeMandatory() {
		return isGrossIncomeRangeMandatory;
	}

	public void setIsGrossIncomeRangeMandatory(Boolean isGrossIncomeRangeMandatory) {
		this.isGrossIncomeRangeMandatory = isGrossIncomeRangeMandatory;
	}

	public Double getMaxGrossIncomeRange() {
		return maxGrossIncomeRange;
	}

	public void setMaxGrossIncomeRange(Double maxGrossIncomeRange) {
		this.maxGrossIncomeRange = maxGrossIncomeRange;
	}

	public Double getMinGrossIncomeRange() {
		return minGrossIncomeRange;
	}

	public void setMinGrossIncomeRange(Double minGrossIncomeRange) {
		this.minGrossIncomeRange = minGrossIncomeRange;
	}

	public Integer getBasedOnIncomeType() {
		return basedOnIncomeType;
	}

	public void setBasedOnIncomeType(Integer basedOnIncomeType) {
		this.basedOnIncomeType = basedOnIncomeType;
	}

	public Integer getMultiplierIncomeType() {
		return multiplierIncomeType;
	}

	public void setMultiplierIncomeType(Integer multiplierIncomeType) {
		this.multiplierIncomeType = multiplierIncomeType;
	}
	
	public List<EmiNmiDetailRequest> getEmiNmiDetailRequestList() {
		return emiNmiDetailRequestList;
	}

	public void setEmiNmiDetailRequestList(List<EmiNmiDetailRequest> emiNmiDetailRequestList) {
		this.emiNmiDetailRequestList = emiNmiDetailRequestList;
	}

	public Integer getBasedOnType() {
		return basedOnType;
	}

	public void setBasedOnType(Integer basedOnType) {
		this.basedOnType = basedOnType;
	}

	public Double getMinNetTakeHomeSalary() {
		return minNetTakeHomeSalary;
	}

	public void setMinNetTakeHomeSalary(Double minNetTakeHomeSalary) {
		this.minNetTakeHomeSalary = minNetTakeHomeSalary;
	}

	public Boolean getIsMinNetTakeHomeSalaryDisplay() {
		return isMinNetTakeHomeSalaryDisplay;
	}

	public void setIsMinNetTakeHomeSalaryDisplay(Boolean isMinNetTakeHomeSalaryDisplay) {
		this.isMinNetTakeHomeSalaryDisplay = isMinNetTakeHomeSalaryDisplay;
	}

	public Boolean getIsMinNetTakeHomeSalaryMandatory() {
		return isMinNetTakeHomeSalaryMandatory;
	}

	public void setIsMinNetTakeHomeSalaryMandatory(Boolean isMinNetTakeHomeSalaryMandatory) {
		this.isMinNetTakeHomeSalaryMandatory = isMinNetTakeHomeSalaryMandatory;
	}

	public Integer getMinBureauScoreLessThan6Month() {
		return minBureauScoreLessThan6Month;
	}

	public void setMinBureauScoreLessThan6Month(Integer minBureauScoreLessThan6Month) {
		this.minBureauScoreLessThan6Month = minBureauScoreLessThan6Month;
	}

	public Boolean getNoBureauCreditHistory() {
		return noBureauCreditHistory;
	}

	public void setNoBureauCreditHistory(Boolean noBureauCreditHistory) {
		this.noBureauCreditHistory = noBureauCreditHistory;
	}

	public Double getMinRiskScoreRetailOthThnSal() {
		return minRiskScoreRetailOthThnSal;
	}

	public void setMinRiskScoreRetailOthThnSal(Double minRiskScoreRetailOthThnSal) {
		this.minRiskScoreRetailOthThnSal = minRiskScoreRetailOthThnSal;
	}

	public Boolean getIsRiskScoreRetailOthThnSalDisplay() {
		return isRiskScoreRetailOthThnSalDisplay;
	}

	public void setIsRiskScoreRetailOthThnSalDisplay(Boolean isRiskScoreRetailOthThnSalDisplay) {
		this.isRiskScoreRetailOthThnSalDisplay = isRiskScoreRetailOthThnSalDisplay;
	}

	public Boolean getIsRiskScoreRetailOthThnSalMandatory() {
		return isRiskScoreRetailOthThnSalMandatory;
	}

	public void setIsRiskScoreRetailOthThnSalMandatory(Boolean isRiskScoreRetailOthThnSalMandatory) {
		this.isRiskScoreRetailOthThnSalMandatory = isRiskScoreRetailOthThnSalMandatory;
	}

	public Double getMinRiskScoreModelCoAppOthThnSal() {
		return minRiskScoreModelCoAppOthThnSal;
	}

	public void setMinRiskScoreModelCoAppOthThnSal(Double minRiskScoreModelCoAppOthThnSal) {
		this.minRiskScoreModelCoAppOthThnSal = minRiskScoreModelCoAppOthThnSal;
	}

	public Boolean getIsRiskScoreRetailCoAppOthThnSalDisplay() {
		return isRiskScoreRetailCoAppOthThnSalDisplay;
	}

	public void setIsRiskScoreRetailCoAppOthThnSalDisplay(Boolean isRiskScoreRetailCoAppOthThnSalDisplay) {
		this.isRiskScoreRetailCoAppOthThnSalDisplay = isRiskScoreRetailCoAppOthThnSalDisplay;
	}

	public Boolean getIsRiskScoreRetailCoAppOthThnSalMandatory() {
		return isRiskScoreRetailCoAppOthThnSalMandatory;
	}

	public void setIsRiskScoreRetailCoAppOthThnSalMandatory(Boolean isRiskScoreRetailCoAppOthThnSalMandatory) {
		this.isRiskScoreRetailCoAppOthThnSalMandatory = isRiskScoreRetailCoAppOthThnSalMandatory;
	}

	public Boolean getIsCoAppOthThnSalIncomeForEligibilityCalc() {
		return isCoAppOthThnSalIncomeForEligibilityCalc;
	}

	public void setIsCoAppOthThnSalIncomeForEligibilityCalc(Boolean coAppOthThnSalIncomeForEligibilityCalc) {
		isCoAppOthThnSalIncomeForEligibilityCalc = coAppOthThnSalIncomeForEligibilityCalc;
	}

	public List<Integer> getBureauScoreIds() {
		return bureauScoreIds;
	}

	public void setBureauScoreIds(List<Integer> bureauScoreIds) {
		this.bureauScoreIds = bureauScoreIds;
	}

	public Integer getBureauVersion() {
		return bureauVersion;
	}

	public void setBureauVersion(Integer bureauVersion) {
		this.bureauVersion = bureauVersion;
	}

	public Integer getCampaignCode() {
		return campaignCode;
	}

	public void setCampaignCode(Integer campaignCode) {
		this.campaignCode = campaignCode;
	}

	public Double getStdIncrementalPercentage() {
		return stdIncrementalPercentage;
	}

	public void setStdIncrementalPercentage(Double stdIncrementalPercentage) {
		this.stdIncrementalPercentage = stdIncrementalPercentage;
	}

	public Integer getMaxRetirementAge() {
		return maxRetirementAge;
	}

	public void setMaxRetirementAge(Integer maxRetirementAge) {
		this.maxRetirementAge = maxRetirementAge;
	}

	public Boolean getIsAllowAmtPastDue() {
		return isAllowAmtPastDue;
	}

	public void setIsAllowAmtPastDue(Boolean isAllowAmtPastDue) {
		this.isAllowAmtPastDue = isAllowAmtPastDue;
	}

	public Boolean getIsAllowSuitFiled() {
		return isAllowSuitFiled;
	}

	public void setIsAllowSuitFiled(Boolean isAllowSuitFiled) {
		this.isAllowSuitFiled = isAllowSuitFiled;
	}

	public Boolean getIsEmiForEligibilityCalc() {
		return isEmiForEligibilityCalc;
	}

	public void setIsEmiForEligibilityCalc(Boolean isEmiForEligibilityCalc) {
		this.isEmiForEligibilityCalc = isEmiForEligibilityCalc;
	}

	public String getSalAcType() {
		return salAcType;
	}

	public void setSalAcType(String salAcType) {
		this.salAcType = salAcType;
	}

	public Boolean getIsSalAcTypeDisplay() {
		return isSalAcTypeDisplay;
	}

	public void setIsSalAcTypeDisplay(Boolean isSalAcTypeDisplay) {
		this.isSalAcTypeDisplay = isSalAcTypeDisplay;
	}

	public Boolean getIsSalAcTypeMandatory() {
		return isSalAcTypeMandatory;
	}

	public void setIsSalAcTypeMandatory(Boolean isSalAcTypeMandatory) {
		this.isSalAcTypeMandatory = isSalAcTypeMandatory;
	}

	@Override
	public String toString() {
		return "RetailProduct [fpProductId=" + fpProductId + ", currency=" + currency + ", isAgeDisplay=" + isAgeDisplay
				+ ", isAgeMandatory=" + isAgeMandatory + ", isAssetValueDisplay=" + isAssetValueDisplay
				+ ", isAssetValueMandatory=" + isAssetValueMandatory + ", isGeographicalDisplay="
				+ isGeographicalDisplay + ", isGeographicalMandatory=" + isGeographicalMandatory
				+ ", isLoanAmountDisplay=" + isLoanAmountDisplay + ", isLoanAmountMandatory=" + isLoanAmountMandatory
				+ ", isTenureDisplay=" + isTenureDisplay + ", isTenureMandatory=" + isTenureMandatory
				+ ", isYearlyIncomeRangeDisplay=" + isYearlyIncomeRangeDisplay + ", isYearlyIncomeRangeMandatory="
				+ isYearlyIncomeRangeMandatory + ", maxAge=" + maxAge + ", maxAssetValue=" + maxAssetValue
				+ ", maxLoanAmount=" + maxLoanAmount + ", maxTenure=" + maxTenure + ", maxYearlyIncomeRange="
				+ maxYearlyIncomeRange + ", minAge=" + minAge + ", minAssetValue=" + minAssetValue + ", minLoanAmount="
				+ minLoanAmount + ", minTenure=" + minTenure + ", minYearlyIncomeRange=" + minYearlyIncomeRange
				+ ", countryList=" + countryList + ", stateList=" + stateList + ", cityList=" + cityList
				+ ", minMonthlyIncomeRange=" + minMonthlyIncomeRange + ", maxMonthlyIncomeRange="
				+ maxMonthlyIncomeRange + ", isMonthlyIncomeRangeDisplay=" + isMonthlyIncomeRangeDisplay
				+ ", isMonthlyIncomeRangeMandatory=" + isMonthlyIncomeRangeMandatory + ", isGrossIncomeRangeDisplay="
				+ isGrossIncomeRangeDisplay + ", isGrossIncomeRangeMandatory=" + isGrossIncomeRangeMandatory
				+ ", maxGrossIncomeRange=" + maxGrossIncomeRange + ", minGrossIncomeRange=" + minGrossIncomeRange
				+ ", minBureauScore=" + minBureauScore + ", maxBureauScore=" + maxBureauScore
				+ ", minBureauScoreLessThan6Month=" + minBureauScoreLessThan6Month + ", noBureauCreditHistory="
				+ noBureauCreditHistory + ", isBureauScoreDisplay=" + isBureauScoreDisplay + ", isBureauScoreMandatory="
				+ isBureauScoreMandatory + ", minBureauScoreDays=" + minBureauScoreDays + ", maxBureauScoreDays="
				+ maxBureauScoreDays + ", isBureauScoreDaysDisplay=" + isBureauScoreDaysDisplay
				+ ", isBureauScoreDaysMandatory=" + isBureauScoreDaysMandatory + ", minRiskScoreRetail="
				+ minRiskScoreRetail + ", maxRiskScoreRetail=" + maxRiskScoreRetail + ", isRiskScoreRetailDisplay="
				+ isRiskScoreRetailDisplay + ", isRiskScoreRetailMandatory=" + isRiskScoreRetailMandatory
				+ ", minRiskScoreRetailOthThnSal=" + minRiskScoreRetailOthThnSal
				+ ", isRiskScoreRetailOthThnSalDisplay=" + isRiskScoreRetailOthThnSalDisplay
				+ ", isRiskScoreRetailOthThnSalMandatory=" + isRiskScoreRetailOthThnSalMandatory
				+ ", minRiskScoreModelCoAppOthThnSal=" + minRiskScoreModelCoAppOthThnSal
				+ ", isRiskScoreRetailCoAppOthThnSalDisplay=" + isRiskScoreRetailCoAppOthThnSalDisplay
				+ ", isRiskScoreRetailCoAppOthThnSalMandatory=" + isRiskScoreRetailCoAppOthThnSalMandatory
				+ ", isCoAppOthThnSalIncomeForEligibilityCalc=" + isCoAppOthThnSalIncomeForEligibilityCalc
				+ ", empWithIds=" + empWithIds + ", isEmpWithDisplay=" + isEmpWithDisplay + ", isEmpWithMandatory="
				+ isEmpWithMandatory + ", isEmpRatingDisplay=" + isEmpRatingDisplay + ", isEmpRatingMandatory="
				+ isEmpRatingMandatory + ", minTotalJobExp=" + minTotalJobExp + ", maxTotalJobExp=" + maxTotalJobExp
				+ ", isTotalJobExpDisplay=" + isTotalJobExpDisplay + ", isTotalJobExpMandatory="
				+ isTotalJobExpMandatory + ", minTotalCurrentJobExp=" + minTotalCurrentJobExp
				+ ", maxTotalCurrentJobExp=" + maxTotalCurrentJobExp + ", isTotalCurrentJobExpDisplay="
				+ isTotalCurrentJobExpDisplay + ", isTotalCurrentJobExpMandatory=" + isTotalCurrentJobExpMandatory
				+ ", empStatusIds=" + empStatusIds + ", isEmpStatusDisplay=" + isEmpStatusDisplay
				+ ", isEmpStatusMandatory=" + isEmpStatusMandatory + ", creditRatingSelectedList="
				+ creditRatingSelectedList + ", userOrgId=" + userOrgId + ", userCreditRating=" + userCreditRating
				+ ", isBankingRelationMandatory=" + isBankingRelationMandatory + ", isBankingRelationDisplay="
				+ isBankingRelationDisplay + ", minBankRelation=" + minBankRelation + ", maxBankRelation="
				+ maxBankRelation + ", salaryModeIds=" + salaryModeIds + ", isSalaryModeDisplay=" + isSalaryModeDisplay
				+ ", isSalaryModeMandatory=" + isSalaryModeMandatory + ", isSalaryAcTypeDisplay="
				+ isSalaryAcTypeDisplay + ", isSalaryAcTypeMandatory=" + isSalaryAcTypeMandatory + ", salaryAcType="
				+ salaryAcType + ", assessmentMethodId=" + assessmentMethodId + ", emiNmiDetailRequestList="
				+ emiNmiDetailRequestList + ", isBasedOnIncome=" + isBasedOnIncome + ", isMultiplierOfIncomeCheck="
				+ isMultiplierOfIncomeCheck + ", multiplierOfIncomeCheck=" + multiplierOfIncomeCheck
				+ ", isEmiNmiCheck=" + isEmiNmiCheck + ", emiNmiCheck=" + emiNmiCheck + ", basedOnIncomeType="
				+ basedOnIncomeType + ", multiplierIncomeType=" + multiplierIncomeType + ", basedOnType=" + basedOnType
				+ ", bureauVersion=" + bureauVersion + ", minNetTakeHomeSalary=" + minNetTakeHomeSalary
				+ ", isMinNetTakeHomeSalaryDisplay=" + isMinNetTakeHomeSalaryDisplay
				+ ", isMinNetTakeHomeSalaryMandatory=" + isMinNetTakeHomeSalaryMandatory + ", campaignCode="
				+ campaignCode + ", stdIncrementalPercentage=" + stdIncrementalPercentage + ", maxRetirementAge="
				+ maxRetirementAge + ", isAllowAmtPastDue=" + isAllowAmtPastDue + ", isAllowSuitFiled="
				+ isAllowSuitFiled + ", isEmiForEligibilityCalc=" + isEmiForEligibilityCalc + ", salAcType=" + salAcType
				+ ", isSalAcTypeDisplay=" + isSalAcTypeDisplay + ", isSalAcTypeMandatory=" + isSalAcTypeMandatory
				+ ", bureauScoreIds=" + bureauScoreIds + ", getJobId()=" + getJobId() + ", getId()=" + getId()
				+ ", getEndDate()=" + getEndDate() + ", getName()=" + getName() + ", getProductId()=" + getProductId()
				+ ", getStartDate()=" + getStartDate() + ", getUserId()=" + getUserId() + ", getProductCode()="
				+ getProductCode() + ", getIsMatched()=" + getIsMatched() + ", getCreatedDate()=" + getCreatedDate()
				+ ", getFpName()=" + getFpName() + ", getIsActive()=" + getIsActive() + ", getAppstage()="
				+ getAppstage() + ", getScoreModelId()=" + getScoreModelId() + ", getBusinessTypeId()="
				+ getBusinessTypeId() + ", getIsParameterFilled()=" + getIsParameterFilled() + ", getWcRenewalStatus()="
				+ getWcRenewalStatus() + ", getFinId()=" + getFinId() + ", getProposalCount()=" + getProposalCount()
				+ ", getActiveInactiveJobId()=" + getActiveInactiveJobId() + ", getActionFor()=" + getActionFor()
				+ ", getGstType()=" + getGstType() + ", getScoreModelIdCoAppId()=" + getScoreModelIdCoAppId()
				+ ", getPurposeLoanModelId()=" + getPurposeLoanModelId() + ", getImportFromId()=" + getImportFromId()
				+ ", getIsGst()=" + getIsGst() + ", getIsItr()=" + getIsItr() + ", getIsBankStatement()="
				+ getIsBankStatement() + ", getIsMca()=" + getIsMca() + ", getIsBureuPersonal()=" + getIsBureuPersonal()
				+ ", getIsBureuCommercial()=" + getIsBureuCommercial() + ", getIsManualFill()=" + getIsManualFill()
				+ ", getScoreModelIdOthThnSal()=" + getScoreModelIdOthThnSal() + ", getScoreModelIdCoAppIdOthThnSal()="
				+ getScoreModelIdCoAppIdOthThnSal() + ", getProductType()=" + getProductType()
				+ ", getMinInterestCoverageWithDepreciation()=" + getMinInterestCoverageWithDepreciation()
				+ ", getMaxInterestCoverageWithDepreciation()=" + getMaxInterestCoverageWithDepreciation()
				+ ", getIsInterestCoverageWithDepreciationDisplay()=" + getIsInterestCoverageWithDepreciationDisplay()
				+ ", getIsInterestCoverageWithDepreciationMandatory()="
				+ getIsInterestCoverageWithDepreciationMandatory() + ", getIndividualBureauMaximumSixMonthDPDs()="
				+ getIndividualBureauMaximumSixMonthDPDs() + ", getIsIndividualBureauMaximumSixMonthDPDsDisplay()="
				+ getIsIndividualBureauMaximumSixMonthDPDsDisplay()
				+ ", getIsIndividualBureauMaximumSixMonthDPDsMandatory()="
				+ getIsIndividualBureauMaximumSixMonthDPDsMandatory()
				+ ", getIsIndividualBureauMaximumThreeMonthDPDsDisplay()="
				+ getIsIndividualBureauMaximumThreeMonthDPDsDisplay()
				+ ", getIsIndividualBureauMaximumThreeMonthDPDsMandatory()="
				+ getIsIndividualBureauMaximumThreeMonthDPDsMandatory()
				+ ", getIndividualBureauMaximumThreeMonthDPDs()=" + getIndividualBureauMaximumThreeMonthDPDs()
				+ ", getProductTab()=" + getProductTab() + ", getModifiedDate()=" + getModifiedDate()
				+ ", getGetData()=" + getGetData() + ", getNextPage()=" + getNextPage() + ", getPageIndex()="
				+ getPageIndex() + ", getSize()=" + getSize() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
