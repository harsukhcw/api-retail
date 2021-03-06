
package com.opl.retail.api.model.analyzer.finbit;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "average",
    "MonthlyDetails",
    "total",
    "totalValue"
})
public class InterestPaid {

    @JsonProperty("average")
    private Double average;
    @JsonProperty("MonthlyDetails")
    private List<MonthlyDetail> monthlyDetails = null;
    @JsonProperty("total")
    private Double total;
    @JsonProperty("totalValue")
    private Double totalValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("average")
    public Double getAverage() {
        return average;
    }

    @JsonProperty("average")
    public void setAverage(Double average) {
        this.average = average;
    }

    @JsonProperty("MonthlyDetails")
    public List<MonthlyDetail> getMonthlyDetails() {
        return monthlyDetails;
    }

    @JsonProperty("MonthlyDetails")
    public void setMonthlyDetails(List<MonthlyDetail> monthlyDetails) {
        this.monthlyDetails = monthlyDetails;
    }

    @JsonProperty("total")
    public Double getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Double total) {
        this.total = total;
    }

    @JsonProperty("totalValue")
    public Double getTotalValue() {
        return totalValue;
    }

    @JsonProperty("totalValue")
    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
