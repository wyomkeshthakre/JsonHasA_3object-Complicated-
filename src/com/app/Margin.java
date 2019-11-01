package com.app;

public class Margin {

	private Integer margId;
	private String margCode;
	public Margin() {
		super();
	}
	public Integer getMargId() {
		return margId;
	}
	public void setMargId(Integer margId) {
		this.margId = margId;
	}
	public String getMargCode() {
		return margCode;
	}
	public void setMargCode(String margCode) {
		this.margCode = margCode;
	}
	@Override
	public String toString() {
		return "Margin [margId=" + margId + ", margCode=" + margCode + "]";
	}
	
}
