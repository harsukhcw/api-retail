package com.opl.retail.api.model.scoring_retail;

public class FieldMasterJsonValueRequest {

	private Long id;
	private String value;
	private String code;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "FieldMasterJsonValueRequest [id=" + id + ", value=" + value + ", code=" + code + "]";
	}
}
