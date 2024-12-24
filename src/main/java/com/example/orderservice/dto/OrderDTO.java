package com.example.orderservice.dto;

import java.time.LocalDateTime;

public class OrderDTO {
	private Long id;
	private Long productId;
	private Integer quantity;
	private LocalDateTime orderDate;
	private String status;

	public OrderDTO() {
	}

	public OrderDTO(Long id, Long productId, Integer quantity, LocalDateTime orderDate, String status) {
		this.id = id;
		this.productId = productId;
		this.quantity = quantity;
		this.orderDate = orderDate;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
