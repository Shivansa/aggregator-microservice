package com.assignment.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.order.controller.dto.response.OrdersDetailResponseTO;
import com.assignment.order.services.OrdersService;

@RestController
@RequestMapping(value = "/orders")
public class OrdersController {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrdersController.class);

	@Autowired
	OrdersService ordersService;

	@GetMapping("/{orderId}")
	public ResponseEntity<OrdersDetailResponseTO> getOrdersDetail(@PathVariable(value = "orderId") long orderId) {
		LOGGER.info("Method getOrdersDetail start");
		OrdersDetailResponseTO responseTO = ordersService.getOrdersDetail(orderId);
		LOGGER.info("Method getOrdersDetail end");
		return new ResponseEntity<>(responseTO, HttpStatus.OK);
	}

}
