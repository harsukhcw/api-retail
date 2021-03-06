package com.opl.retail.api.model.loans.corporate;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.opl.retail.api.model.loans.Address;
import com.opl.retail.api.model.loans.AssociatedConcernDetailRequest;
import com.opl.retail.api.model.loans.DirectorBackgroundDetailRequest;
import com.opl.retail.api.model.loans.FinancialArrangementsDetailRequest;



/**
 * @author akshay
 *
 */
/**
 * @author akshay
 *
 */
public class FundSeekerInputRequestResponse {

    private Long userId;

    private Long clientId;

    private Long applicationId;
    private Integer businessTypeId;

    private Long keyVericalFunding;

    private Long keyVerticalSector;

    private Long keyVerticalSubsector;

    private Address firstAddress;

    private String organisationName;

    private String gstIn;

    private String pan;

    private String aadhar;

    private String msmeRegistrationNumber;
    
    private String castCategory;

    private Double loanAmount;


    private Integer purposeOfLoanId;

    private Boolean haveCollateralSecurity;

    private Boolean isGstCompleted;

    private Boolean isItrCompleted;
    
    private Double collateralSecurityAmount;

    private Integer constitutionId;

    private List<CollateralSecurityDetailRequest> collateralSecurityList = Collections.emptyList();
    
    private List<FinancialArrangementsDetailRequest> financialArrangementsDetailRequestsList = Collections.emptyList();

    private List<DirectorBackgroundDetailRequest> directorBackgroundDetailRequestsList = Collections.emptyList();

    private List<AssociatedConcernDetailRequest> associatedConcernDetailRequestsList = Collections.emptyList();


    ///////////
    private List<Long> industrylist = Collections.emptyList();

    private List<Long> sectorlist = Collections.emptyList();

    private List<Long> subsectors = Collections.emptyList();
    /////////
    private Double costOfMachinery;
    private Double incrementalTurnover;

    //Sales Variables by Akshay


    /*
    * added for machinery equipment finance
    * */
    private Integer assessmentId;

    private Integer sinceYear;
    private Integer sinceMonth;
    private Integer numberOfEmployee;

    private Integer estYear;

    //-------------For NTB
    private Double tenureRequired;
    private Integer proposedDetailsOfUnit;
    private Double costOfProject;
    private Date proposedOperationDate;
    private Integer proposedConstitutionOfUnit;
    private Double promoterContribution;
    /*
     * Promoter Contribution Logic
     * BY Ravina
     * */
    private Double totalAmtPercentage;


    private Long stateId;
    private Long cityId;
    private Double proposedCost;

    /*
     * SBI MSME Integration related fields
     * By Ravina
     * */
    private Date commercialOperationDate;
    private Integer factoryPremise;
    private Integer knowHow;
    private Integer competition;
    private String productServiceDescription;

    /*FOR NTB CAM BY BIHAG*/
    private String loanAmt;
    private String costOfProjectStr;
    private String collateralSecurityAmountStr;

    /*For Eligibility method*/
    private Double incrementalMargin;

    private Long environmentalImpactId;

    private Integer actionId;

    private Double turnOverPrevFinYear;

    private Double turnOverCurrFinYearTillMonth;

    private Double projectedTurnOverCurrFinYear;

    private Double profitCurrFinYear;

    private Double projectedProfitCurrFinYear;

    private Double enhancementAmount;
    
    private Boolean isAdditionalAmount;
    
    private Boolean  isAllowSwitchExistingLender;
    
    private Double additionalLoanAmount;
    
    private Double borrowerDcldProjectedSales;
    
    private String currentFinancialYear;

    private String xmlResponseExternal;
    
    private Boolean isIsoCertified;
    
    
    
    
	public Boolean getIsIsoCertified() {
		return isIsoCertified;
	}

	public void setIsIsoCertified(Boolean isIsoCertified) {
		this.isIsoCertified = isIsoCertified;
	}

	public Long getUserId() {
        return userId;
    }

	public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getBusinessTypeId() {
        return businessTypeId;
    }

    public void setBusinessTypeId(Integer businessTypeId) {
        this.businessTypeId = businessTypeId;
    }

    public Long getKeyVericalFunding() {
        return keyVericalFunding;
    }

    public void setKeyVericalFunding(Long keyVericalFunding) {
        this.keyVericalFunding = keyVericalFunding;
    }

    public Long getKeyVerticalSector() {
        return keyVerticalSector;
    }

    public void setKeyVerticalSector(Long keyVerticalSector) {
        this.keyVerticalSector = keyVerticalSector;
    }

    public Long getKeyVerticalSubsector() {
        return keyVerticalSubsector;
    }

    public void setKeyVerticalSubsector(Long keyVerticalSubsector) {
        this.keyVerticalSubsector = keyVerticalSubsector;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }



    public Boolean getHaveCollateralSecurity() {
        return haveCollateralSecurity;
    }

    public void setHaveCollateralSecurity(Boolean haveCollateralSecurity) {
        this.haveCollateralSecurity = haveCollateralSecurity;
    }

    public Double getCollateralSecurityAmount() {
        return collateralSecurityAmount;
    }

    public void setCollateralSecurityAmount(Double collateralSecurityAmount) {
        this.collateralSecurityAmount = collateralSecurityAmount;
    }

    public List<FinancialArrangementsDetailRequest> getFinancialArrangementsDetailRequestsList() {
        return financialArrangementsDetailRequestsList;
    }

    public void setFinancialArrangementsDetailRequestsList(List<FinancialArrangementsDetailRequest> financialArrangementsDetailRequestsList) {
        this.financialArrangementsDetailRequestsList = financialArrangementsDetailRequestsList;
    }

    public List<DirectorBackgroundDetailRequest> getDirectorBackgroundDetailRequestsList() {
        return directorBackgroundDetailRequestsList;
    }

    public void setDirectorBackgroundDetailRequestsList(List<DirectorBackgroundDetailRequest> directorBackgroundDetailRequestsList) {
        this.directorBackgroundDetailRequestsList = directorBackgroundDetailRequestsList;
    }

    public Integer getPurposeOfLoanId() {
        return purposeOfLoanId;
    }

    public void setPurposeOfLoanId(Integer purposeOfLoanId) {
        this.purposeOfLoanId = purposeOfLoanId;
    }


    public List<Long> getIndustrylist() {
        return industrylist;
    }

    public void setIndustrylist(List<Long> industrylist) {
        this.industrylist = industrylist;
    }

    public List<Long> getSectorlist() {
        return sectorlist;
    }

    public void setSectorlist(List<Long> sectorlist) {
        this.sectorlist = sectorlist;
    }

    public List<Long> getSubsectors() {
        return subsectors;
    }

    public void setSubsectors(List<Long> subsectors) {
        this.subsectors = subsectors;
    }

    public Address getFirstAddress() {
        return firstAddress;
    }

    public void setFirstAddress(Address firstAddress) {
        this.firstAddress = firstAddress;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public Integer getConstitutionId() {
        return constitutionId;
    }

    public void setConstitutionId(Integer constitutionId) {
        this.constitutionId = constitutionId;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getMsmeRegistrationNumber() {
        return msmeRegistrationNumber;
    }

    public void setMsmeRegistrationNumber(String msmeRegistrationNumber) {
        this.msmeRegistrationNumber = msmeRegistrationNumber;
    }

    public Double getCostOfMachinery() {
        return costOfMachinery;
    }

    public void setCostOfMachinery(Double costOfMachinery) {
        this.costOfMachinery = costOfMachinery;
    }

    public Double getIncrementalTurnover() {
        return incrementalTurnover;
    }

    public void setIncrementalTurnover(Double incrementalTurnover) {
        this.incrementalTurnover = incrementalTurnover;
    }

    public Double getTenureRequired() {
        return tenureRequired;
    }

    public void setTenureRequired(Double tenureRequired) {
        this.tenureRequired = tenureRequired;
    }

    public Integer getProposedDetailsOfUnit() {
        return proposedDetailsOfUnit;
    }

    public void setProposedDetailsOfUnit(Integer proposedDetailsOfUnit) {
        this.proposedDetailsOfUnit = proposedDetailsOfUnit;
    }

    public Double getCostOfProject() {
        return costOfProject;
    }

    public void setCostOfProject(Double costOfProject) {
        this.costOfProject = costOfProject;
    }

    public Date getProposedOperationDate() {
        return proposedOperationDate;
    }

    public void setProposedOperationDate(Date proposedOperationDate) {
        this.proposedOperationDate = proposedOperationDate;
    }

    public Integer getProposedConstitutionOfUnit() {
        return proposedConstitutionOfUnit;
    }

    public void setProposedConstitutionOfUnit(Integer proposedConstitutionOfUnit) {
        this.proposedConstitutionOfUnit = proposedConstitutionOfUnit;
    }

    public Double getPromoterContribution() {
        return promoterContribution;
    }

    public void setPromoterContribution(Double promoterContribution) {
        this.promoterContribution = promoterContribution;
    }

    public Integer getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Integer assessmentId) {
        this.assessmentId = assessmentId;
    }

    public Double getTotalAmtPercentage() {
        return totalAmtPercentage;
    }

    public void setTotalAmtPercentage(Double totalAmtPercentage) {
        this.totalAmtPercentage = totalAmtPercentage;
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Double getProposedCost() {
        return proposedCost;
    }

    public void setProposedCost(Double proposedCost) {
        this.proposedCost = proposedCost;
    }


    public Date getCommercialOperationDate() {
        return commercialOperationDate;
    }

    public void setCommercialOperationDate(Date commercialOperationDate) {
        this.commercialOperationDate = commercialOperationDate;
    }

    public Integer getFactoryPremise() {
        return factoryPremise;
    }

    public void setFactoryPremise(Integer factoryPremise) {
        this.factoryPremise = factoryPremise;
    }

    public Integer getKnowHow() {
        return knowHow;
    }

    public void setKnowHow(Integer knowHow) {
        this.knowHow = knowHow;
    }

    public Integer getCompetition() {
        return competition;
    }

    public void setCompetition(Integer competition) {
        this.competition = competition;
    }

    public Double getIncrementalMargin() {
        return incrementalMargin;
    }

    public void setIncrementalMargin(Double incrementalMargin) {
        this.incrementalMargin = incrementalMargin;
    }

    public Long getEnvironmentalImpactId() {
        return environmentalImpactId;
    }

    public void setEnvironmentalImpactId(Long environmentalImpactId) {
        this.environmentalImpactId = environmentalImpactId;
    }

    public String getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(String loanAmt) {
		this.loanAmt = loanAmt;
	}

	public String getCostOfProjectStr() {
		return costOfProjectStr;
	}

	public void setCostOfProjectStr(String costOfProjectStr) {
		this.costOfProjectStr = costOfProjectStr;
	}

	public String getCollateralSecurityAmountStr() {
		return collateralSecurityAmountStr;
	}

	public void setCollateralSecurityAmountStr(String collateralSecurityAmountStr) {
		this.collateralSecurityAmountStr = collateralSecurityAmountStr;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public Integer getActionId() {
		return actionId;
	}

	public void setActionId(Integer actionId) {
		this.actionId = actionId;
	}

	public Double getTurnOverPrevFinYear() {
		return turnOverPrevFinYear;
	}

	public void setTurnOverPrevFinYear(Double turnOverPrevFinYear) {
		this.turnOverPrevFinYear = turnOverPrevFinYear;
	}

	public Double getTurnOverCurrFinYearTillMonth() {
		return turnOverCurrFinYearTillMonth;
	}

	public void setTurnOverCurrFinYearTillMonth(Double turnOverCurrFinYearTillMonth) {
		this.turnOverCurrFinYearTillMonth = turnOverCurrFinYearTillMonth;
	}

	public Double getProjectedTurnOverCurrFinYear() {
		return projectedTurnOverCurrFinYear;
	}

	public void setProjectedTurnOverCurrFinYear(Double projectedTurnOverCurrFinYear) {
		this.projectedTurnOverCurrFinYear = projectedTurnOverCurrFinYear;
	}

	public Double getProfitCurrFinYear() {
		return profitCurrFinYear;
	}

	public void setProfitCurrFinYear(Double profitCurrFinYear) {
		this.profitCurrFinYear = profitCurrFinYear;
	}

	public Double getProjectedProfitCurrFinYear() {
		return projectedProfitCurrFinYear;
	}

	public void setProjectedProfitCurrFinYear(Double projectedProfitCurrFinYear) {
		this.projectedProfitCurrFinYear = projectedProfitCurrFinYear;
	}

	public Boolean getIsGstCompleted() {
		return isGstCompleted;
	}

	public void setIsGstCompleted(Boolean isGstCompleted) {
		this.isGstCompleted = isGstCompleted;
	}

	public Boolean getIsItrCompleted() {
		return isItrCompleted;
	}

	public void setIsItrCompleted(Boolean isItrCompleted) {
		this.isItrCompleted = isItrCompleted;
	}

	public String getGstIn() {
		return gstIn;
	}

	public void setGstIn(String gstIn) {
		this.gstIn = gstIn;
	}

	public List<AssociatedConcernDetailRequest> getAssociatedConcernDetailRequestsList() {
		return associatedConcernDetailRequestsList;
	}

	public void setAssociatedConcernDetailRequestsList(List<AssociatedConcernDetailRequest> associatedConcernDetailRequestsList) {
		this.associatedConcernDetailRequestsList = associatedConcernDetailRequestsList;
	}

	public Double getEnhancementAmount() {
		return enhancementAmount;
	}

	public void setEnhancementAmount(Double enhancementAmount) {
		this.enhancementAmount = enhancementAmount;
	}

	public Integer getSinceYear() {
		return sinceYear;
	}

	public Integer getSinceMonth() {
		return sinceMonth;
	}

	public void setSinceYear(Integer sinceYear) {
		this.sinceYear = sinceYear;
	}

	public void setSinceMonth(Integer sinceMonth) {
		this.sinceMonth = sinceMonth;
	}


	public Integer getEstYear() {
		return estYear;
	}

	public void setEstYear(Integer estYear) {
		this.estYear = estYear;
	}

	public Boolean getIsAdditionalAmount() {
		return isAdditionalAmount;
	}

	public void setIsAdditionalAmount(Boolean isAdditionalAmount) {
		this.isAdditionalAmount = isAdditionalAmount;
	}

	public Double getAdditionalLoanAmount() {
		return additionalLoanAmount;
	}

	public void setAdditionalLoanAmount(Double additionalLoanAmount) {
		this.additionalLoanAmount = additionalLoanAmount;
	}

	public Boolean getIsAllowSwitchExistingLender() {
		return isAllowSwitchExistingLender;
	}

	public void setIsAllowSwitchExistingLender(Boolean isAllowSwitchExistingLender) {
		this.isAllowSwitchExistingLender = isAllowSwitchExistingLender;
	}

	public List<CollateralSecurityDetailRequest> getCollateralSecurityList() {
		return collateralSecurityList;
	}

	public void setCollateralSecurityList(List<CollateralSecurityDetailRequest> collateralSecurityList) {
		this.collateralSecurityList = collateralSecurityList;
	}

	public String getCastCategory() {
		return castCategory;
	}

	public void setCastCategory(String castCategory) {
		this.castCategory = castCategory;
	}

    public String getProductServiceDescription() {
        return productServiceDescription;
    }

    public void setProductServiceDescription(String productServiceDescription) {
        this.productServiceDescription = productServiceDescription;
    }


	public Double getBorrowerDcldProjectedSales() {
		return borrowerDcldProjectedSales;
	}

	public void setBorrowerDcldProjectedSales(Double borrowerDcldProjectedSales) {
		this.borrowerDcldProjectedSales = borrowerDcldProjectedSales;
	}

	public String getCurrentFinancialYear() {
		return currentFinancialYear;
	}

	public void setCurrentFinancialYear(String currentFinancialYear) {
		this.currentFinancialYear = currentFinancialYear;
	}


    public String getXmlResponseExternal() {
        return xmlResponseExternal;
    }

    public void setXmlResponseExternal(String xmlResponseExternal) {
        this.xmlResponseExternal = xmlResponseExternal;
    }

    public Integer getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(Integer numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
	public String toString() {
		return "FundSeekerInputRequestResponse [userId=" + userId + ", clientId=" + clientId + ", applicationId="
				+ applicationId + ", businessTypeId=" + businessTypeId + ", keyVericalFunding=" + keyVericalFunding
				+ ", keyVerticalSector=" + keyVerticalSector + ", keyVerticalSubsector=" + keyVerticalSubsector
				+ ", firstAddress=" + firstAddress + ", organisationName=" + organisationName + ", gstIn=" + gstIn
				+ ", pan=" + pan + ", aadhar=" + aadhar + ", msmeRegistrationNumber=" + msmeRegistrationNumber
				+ ", castCategory=" + castCategory + ", loanAmount=" + loanAmount + ", purposeOfLoanId="
				+ purposeOfLoanId + ", haveCollateralSecurity=" + haveCollateralSecurity + ", isGstCompleted="
				+ isGstCompleted + ", isItrCompleted=" + isItrCompleted + ", collateralSecurityAmount="
				+ collateralSecurityAmount + ", constitutionId=" + constitutionId + ", collateralSecurityList="
				+ collateralSecurityList + ", financialArrangementsDetailRequestsList="
				+ financialArrangementsDetailRequestsList + ", directorBackgroundDetailRequestsList="
				+ directorBackgroundDetailRequestsList + ", associatedConcernDetailRequestsList="
				+ associatedConcernDetailRequestsList + ", industrylist=" + industrylist + ", sectorlist=" + sectorlist
				+ ", subsectors=" + subsectors + ", costOfMachinery=" + costOfMachinery + ", incrementalTurnover="
				+ incrementalTurnover + ", assessmentId=" + assessmentId + ", sinceYear=" + sinceYear + ", sinceMonth="
				+ sinceMonth + ", estYear=" + estYear + ", tenureRequired=" + tenureRequired
				+ ", proposedDetailsOfUnit=" + proposedDetailsOfUnit + ", costOfProject=" + costOfProject
				+ ", proposedOperationDate=" + proposedOperationDate + ", proposedConstitutionOfUnit="
				+ proposedConstitutionOfUnit + ", promoterContribution=" + promoterContribution
				+ ", totalAmtPercentage=" + totalAmtPercentage + ", stateId=" + stateId + ", cityId=" + cityId
				+ ", proposedCost=" + proposedCost + ", commercialOperationDate=" + commercialOperationDate
				+ ", factoryPremise=" + factoryPremise + ", knowHow=" + knowHow + ", competition=" + competition
				+ ", productServiceDescription=" + productServiceDescription + ", loanAmt=" + loanAmt
				+ ", costOfProjectStr=" + costOfProjectStr + ", collateralSecurityAmountStr="
				+ collateralSecurityAmountStr + ", incrementalMargin=" + incrementalMargin + ", environmentalImpactId="
				+ environmentalImpactId + ", actionId=" + actionId + ", turnOverPrevFinYear=" + turnOverPrevFinYear
				+ ", turnOverCurrFinYearTillMonth=" + turnOverCurrFinYearTillMonth + ", projectedTurnOverCurrFinYear="
				+ projectedTurnOverCurrFinYear + ", profitCurrFinYear=" + profitCurrFinYear
				+ ", projectedProfitCurrFinYear=" + projectedProfitCurrFinYear + ", enhancementAmount="
				+ enhancementAmount + ", isAdditionalAmount=" + isAdditionalAmount + ", isAllowSwitchExistingLender="
				+ isAllowSwitchExistingLender + ", additionalLoanAmount=" + additionalLoanAmount
				+ ", borrowerDcldProjectedSales=" + borrowerDcldProjectedSales + ", currentFinancialYear="
				+ currentFinancialYear + ", xmlResponseExternal=" + xmlResponseExternal + ", isIsoCertified="
				+ isIsoCertified + "]";
	}
    
}
