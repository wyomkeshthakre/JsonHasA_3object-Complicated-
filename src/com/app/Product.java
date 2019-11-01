package com.app;

import java.util.List;

public class Product {

	private Integer productId;
	private String productName;
	private List<Model> modelObjs;
	public Product() {
		super();
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public List<Model> getModelObjs() {
		return modelObjs;
	}
	public void setModelObjs(List<Model> modelObjs) {
		this.modelObjs = modelObjs;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", modelObjs=" + modelObjs + "]";
	}
	
}
