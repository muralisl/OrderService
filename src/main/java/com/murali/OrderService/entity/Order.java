package com.murali.OrderService.entity;

import java.time.Instant;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity(name="ODER_DETAILS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	@Column(name="PRODUCT_ID")
	private long productId;
	
	@Column(name="QUANTITY")
	private long quatity;
	
	@Column(name="ORDER_DATE")
	private Instant orderDate;
	
	@Column(name="STATUS")
	private String orderStatus;
	
	@Column(name="TOTAL_AMOUNT")
	private long amount;
	
	

}
