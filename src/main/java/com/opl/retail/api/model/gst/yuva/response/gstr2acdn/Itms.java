/**
 * 
 */
package com.opl.retail.api.model.gst.yuva.response.gstr2acdn;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.io.Serializable;

/**
 * @author nilay
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
public class Itms implements Serializable{
	
	private Double num;
	
	private Itm_det itm_det;

	/**
	 * @return the num
	 */
	public Double getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(Double num) {
		this.num = num;
	}

	/**
	 * @return the itm_det
	 */
	public Itm_det getItm_det() {
		return itm_det;
	}

	/**
	 * @param itm_det the itm_det to set
	 */
	public void setItm_det(Itm_det itm_det) {
		this.itm_det = itm_det;
	}

	public Itms() {
		this.num = 0.0;
		this.itm_det = new Itm_det();
	}
}
