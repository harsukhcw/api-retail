package com.opl.retail.api.enums.scoring;

public enum FieldMasterType {
	RANGE(1, "RANGE", "RANGE"),
	FIXED(2, "FIXED", "FIXED"),
	COMBINATION(2, "COMBINATION", "COMBINATION");

	private final Integer id;
	private final String value;
	private final String description;

	FieldMasterType(Integer id, String value, String description) {
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

	public static FieldMasterType getById(Integer id) {
		switch (id) {
		case 1:
			return RANGE;
		case 2:
			return FIXED;
		default:
			return null;
		}
	}

	public static FieldMasterType[] getAll() {
		return FieldMasterType.values();

	}
}