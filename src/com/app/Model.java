package com.app;

import java.util.Map;

public class Model {

	private Integer modelId;
	private String modelCode;
	private Double modelCost;
	private Map<Integer,Margin> marginObjs;
	public Model() {
		super();
	}
	public Integer getModelId() {
		return modelId;
	}
	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public Double getModelCost() {
		return modelCost;
	}
	public void setModelCost(Double modelCost) {
		this.modelCost = modelCost;
	}
	public Map<Integer, Margin> getMarginObjs() {
		return marginObjs;
	}
	public void setMarginObjs(Map<Integer, Margin> marginObjs) {
		this.marginObjs = marginObjs;
	}
	@Override
	public String toString() {
		return "Model [modelId=" + modelId + ", modelCode=" + modelCode + ", modelCost=" + modelCost + ", marginObjs="
				+ marginObjs + "]";
	}
	
}
