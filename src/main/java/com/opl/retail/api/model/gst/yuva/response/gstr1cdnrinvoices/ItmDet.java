
package com.opl.retail.api.model.gst.yuva.response.gstr1cdnrinvoices;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author vijay.chauhan
 *
 */


@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
public class ItmDet {

    @JsonProperty("rt")
    private Double rt;
    @JsonProperty("txval")
    private Double txval;
    @JsonProperty("iamt")
    private Double iamt;
    @JsonProperty("csamt")
    private Double csamt;
    @JsonProperty("samt")
    private Double samt;
    @JsonProperty("camt")
    private Double camt;

    @JsonProperty("rt")
    public Double getRt() {
        return rt;
    }

    @JsonProperty("rt")
    public void setRt(Double rt) {
        this.rt = rt;
    }

    @JsonProperty("txval")
    public Double getTxval() {
        return txval;
    }

    @JsonProperty("txval")
    public void setTxval(Double txval) {
        this.txval = txval;
    }

    @JsonProperty("iamt")
    public Double getIamt() {
        return iamt;
    }

    @JsonProperty("iamt")
    public void setIamt(Double iamt) {
        this.iamt = iamt;
    }

    @JsonProperty("csamt")
    public Double getCsamt() {
        return csamt;
    }

    @JsonProperty("csamt")
    public void setCsamt(Double csamt) {
        this.csamt = csamt;
    }

    @JsonProperty("samt")
	public Double getSamt() {
		return samt;
	}

	@JsonProperty("samt")
	public void setSamt(Double samt) {
		this.samt = samt;
	}

	@JsonProperty("camt")
	public Double getCamt() {
		return camt;
	}

	@JsonProperty("camt")
	public void setCamt(Double camt) {
		this.camt = camt;
	}

    
    
}
