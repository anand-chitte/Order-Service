package com.example.orderservice.mapper;

import com.example.orderservice.dto.OrderDTO;
import com.example.orderservice.entity.Order;

public class OrderMapper {

	public static OrderDTO mapToDTO(Order order) {
		return new OrderDTO(order.getId(), order.getProductId(), order.getQuantity(), order.getOrderDate(),
				order.getStatus());
	}

	public static Order mapToEntity(OrderDTO orderDTO) {
		Order order = new Order();
		order.setId(orderDTO.getId());
		order.setProductId(orderDTO.getProductId());
		order.setQuantity(orderDTO.getQuantity());
		order.setOrderDate(orderDTO.getOrderDate());
		order.setStatus(orderDTO.getStatus());
		return order;
	}
}
