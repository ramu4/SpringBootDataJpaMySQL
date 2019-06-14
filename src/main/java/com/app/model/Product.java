package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {

	@Id
	private Integer ProdId;
	private String ProdCode;
	private Double ProdCost;
	public Product() {
		super();
	}
	public Product(Integer prodId, String prodCode, Double prodCost) {
		super();
		ProdId = prodId;
		ProdCode = prodCode;
		ProdCost = prodCost;
	}
	public Integer getProdId() {
		return ProdId;
	}
	public void setProdId(Integer prodId) {
		ProdId = prodId;
	}
	public String getProdCode() {
		return ProdCode;
	}
	public void setProdCode(String prodCode) {
		ProdCode = prodCode;
	}
	public Double getProdCost() {
		return ProdCost;
	}
	public void setProdCost(Double prodCost) {
		ProdCost = prodCost;
	}
	@Override
	public String toString() {
		return "Product [ProdId=" + ProdId + ", ProdCode=" + ProdCode + ", ProdCost=" + ProdCost + "]";
	}
	
	
	

	
	
}
