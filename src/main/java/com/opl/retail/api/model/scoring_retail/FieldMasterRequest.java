package com.opl.retail.api.model.scoring_retail;

public class FieldMasterRequest {

	private Long id;
	
	private String fMstName;
	
	private String fMstDisplayName;
	
	private Double fMstMin;
	
	private Double fMstMax;
	
	private String fMstSymbol;
	
	private String fMstTooltip;
	
	private String fMstConfigurationJson;
	
	private Boolean isVersionDisplay;
	
	private Boolean isIncomeTypeDisplay;
	
	private Integer fMstType;
	
	private Integer sourceId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getfMstName() {
		return fMstName;
	}

	public void setfMstName(String fMstName) {
		this.fMstName = fMstName;
	}

	public String getfMstDisplayName() {
		return fMstDisplayName;
	}

	public void setfMstDisplayName(String fMstDisplayName) {
		this.fMstDisplayName = fMstDisplayName;
	}

	public Double getfMstMin() {
		return fMstMin;
	}

	public void setfMstMin(Double fMstMin) {
		this.fMstMin = fMstMin;
	}

	public Double getfMstMax() {
		return fMstMax;
	}

	public void setfMstMax(Double fMstMax) {
		this.fMstMax = fMstMax;
	}

	public String getfMstSymbol() {
		return fMstSymbol;
	}

	public void setfMstSymbol(String fMstSymbol) {
		this.fMstSymbol = fMstSymbol;
	}

	public String getfMstTooltip() {
		return fMstTooltip;
	}

	public void setfMstTooltip(String fMstTooltip) {
		this.fMstTooltip = fMstTooltip;
	}

	public Integer getfMstType() {
		return fMstType;
	}

	public void setfMstType(Integer fMstType) {
		this.fMstType = fMstType;
	}

	public String getfMstConfigurationJson() {
		return fMstConfigurationJson;
	}

	public void setfMstConfigurationJson(String fMstConfigurationJson) {
		this.fMstConfigurationJson = fMstConfigurationJson;
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

	public Integer getSourceId() {
		return sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	
	
}
