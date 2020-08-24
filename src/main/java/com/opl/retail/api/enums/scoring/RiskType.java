package com.opl.retail.api.enums.scoring;

public enum RiskType {
	PERSONAL_RISK(1, "PERSONAL RISK", "Personal Risk"),
	FINANCIAL_RISK(2, "FINANCIAL RISK", "Finanacial Risk");

	private final Integer id;
	private final String value;
	private final String description;

	RiskType(Integer id, String value, String description) {
		this.id = id;
		this.value = value;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public String getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

	public static RiskType getById(Integer id) {
		switch (id) {
		case 1:
			return PERSONAL_RISK;
		case 2:
			return FINANCIAL_RISK;
		default:
			return null;
		}
	}

	public static RiskType[] getAll() {
		return RiskType.values();

	}
}