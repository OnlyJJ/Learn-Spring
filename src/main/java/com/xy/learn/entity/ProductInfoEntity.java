package com.xy.learn.entity;

public class ProductInfoEntity {
	private Integer id;
	private String productName;
	private String productInfo;
	private Integer productPrice;
	private String produceImg;
	private Integer produceQuantity;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}
	public Integer getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	public String getProduceImg() {
		return produceImg;
	}
	public void setProduceImg(String produceImg) {
		this.produceImg = produceImg;
	}
	public Integer getProduceQuantity() {
		return produceQuantity;
	}
	public void setProduceQuantity(Integer produceQuantity) {
		this.produceQuantity = produceQuantity;
	}
	
}
