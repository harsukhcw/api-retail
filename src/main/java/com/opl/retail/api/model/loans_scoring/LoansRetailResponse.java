package com.opl.retail.api.model.loans_scoring;

import java.util.Collections;
import java.util.List;

/**
 * @author OPL
 *
 */
public class LoansRetailResponse {
	
	
	
	private Long id;
	private String message;
	private Object data;
	private List<?> dataList = Collections.emptyList();
	private Integer status;
	
	
	
	public LoansRetailResponse() {}
	
	public LoansRetailResponse(Integer status,String message) {
		super();
		this.status = status;
		this.message = message;
	}
	
	public LoansRetailResponse(Integer status,String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public List<?> getDataList() {
		return dataList;
	}

	public void setDataList(List<?> dataList) {
		this.dataList = dataList;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	

}
