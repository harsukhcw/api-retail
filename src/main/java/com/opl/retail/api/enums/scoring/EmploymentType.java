package com.opl.retail.api.enums.scoring;

public enum EmploymentType {
	
	SALARAIED(2, "Salaried", "Salaried", " AND is_salaried = TRUE"),
	NON_SALARIED(3, "Non Salaried", "Other Than Salaried", " AND is_non_salaried = TRUE");

	private final Integer id;
	private final String value;
	private final String description;
	private final String sqlWhereCondition;

	EmploymentType(Integer id, String value, String description, String sqlWhereCondition) {
		this.id = id;
		this.value = value;
		this.description = description;
		this.sqlWhereCondition= sqlWhereCondition;
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
	
	public String getSqlWhereCondition() {
		return sqlWhereCondition;
	}

	public static EmploymentType getById(Integer id) {
		switch (id) {
		case 2:
			return SALARAIED;
		case 3:
			return NON_SALARIED;
		default:
			return null;
		}
	}

	public static EmploymentType[] getAll() {
		return EmploymentType.values();

	}
}