package com.opl.retail.api.enums.scoring;

public enum ScoringModelStatus {

	OPEN(1, "Open"),
	IN_PROGRESS(2, "In Progress"),
	REVERTED(3, "Send Back"),
	APPROVED(4, "Approved"),
	REJECTED(5,"Rejected");
	
	private final Integer id;
	private final String value;
	
	private ScoringModelStatus(Integer id, String value){
		this.id = id;
		this.value = value;
	}
	
	public Integer getId() {
		return id;
	}
	public String getValue() {
		return value;
	}
	
	public static String getValueById(Integer id) {
		for(ScoringModelStatus scoringModelStatus : ScoringModelStatus.values()) {
			if(id == scoringModelStatus.getId()) {
				return scoringModelStatus.getValue();
			}
		}
		return null;
	}
}
