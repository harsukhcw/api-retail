package com.opl.retail.api.enums.scoring;

public enum SourceMaster {
	BANK_STATEMENT(1, "Bank Statement", "Bank Statement"),
	BORROWER_INPUT(2, "Borrower Input", "Borrower Input"),
	BUREAU(3, "Bureau", "Bureau"),
	ELIGBLITY(4, "Eligblity", "Eligblity"),
	CALCULATION(5, "Calculation", "Calculation"),
	ITR(6, "ITR", "ITR");

	private final Integer id;
	private final String value;
	private final String description;

	SourceMaster(Integer id, String value, String description) {
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

	public static SourceMaster getById(Integer id) {
		switch (id) {
		case 1:
			return BANK_STATEMENT;
		case 2:
			return BORROWER_INPUT;
		case 3:
			return BUREAU;
		case 4:
			return ELIGBLITY;
		case 5:
			return CALCULATION;
		case 6:
			return ITR;
		default:
			return null;
		}
	}

	public static SourceMaster[] getAll() {
		return SourceMaster.values();

	}
}