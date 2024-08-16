package com.murali.OrderService.service;

import com.murali.OrderService.model.OrderRequest;

public interface OrderService {

	Long placeOrder(OrderRequest orderRequest);

}
