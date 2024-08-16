package com.murali.OrderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.murali.OrderService.model.OrderRequest;
import com.murali.OrderService.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping
	public ResponseEntity<Long> PlaceOrder(@RequestBody OrderRequest orderRequest){
		
		Long id=orderService.placeOrder(orderRequest);
		
		return new ResponseEntity<>(id,HttpStatus.OK);
	}
	
}
