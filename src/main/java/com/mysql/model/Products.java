package com.mysql.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {

	@Id
	@Column(name = "product_id")
	private Integer id;
	
	private String name;
	
	@Column(name = "quantity_in_stock")
	private Integer inStock;
	
	@Column(name = "unit_price")
	private Double unitPrice;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getInStock() {
		return inStock;
	}

	public void setInStock(Integer inStock) {
		this.inStock = inStock;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", inStock=" + inStock + ", unitPrice=" + unitPrice + "]";
	}
}
