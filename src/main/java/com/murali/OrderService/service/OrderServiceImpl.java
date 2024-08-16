package com.murali.OrderService.service;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murali.OrderService.entity.Order;
import com.murali.OrderService.model.OrderRequest;
import com.murali.OrderService.repository.OrderRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public Long placeOrder(OrderRequest orderRequest) {
		log.info("place order initiated");
		Order order=Order.builder()
				.amount(orderRequest.getTotalamount())
				.quatity(orderRequest.getQuatity())
				.orderStatus("CREATED")
				.orderDate(Instant.now())
				.build();
		order=orderRepository.save(order);
		return order.getId();
	}

}
