package com.assignment.order.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.order.controller.dto.response.OrdersDetailResponseTO;
import com.assignment.order.controller.dto.response.OrdersResponseTO;
import com.assignment.order.services.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Override
	public OrdersDetailResponseTO getOrdersDetail(long orderId) {
		
		OrdersDetailResponseTO orders = new OrdersDetailResponseTO();
		orders.setOrders(getOrdersList(orderId));
		return orders;
	}
	
	private List<OrdersResponseTO> getOrdersList(long orderId){
		List<OrdersResponseTO> orderList =new ArrayList<>();
		OrdersResponseTO order1 = new OrdersResponseTO();
		order1.setOrderId(1);
		order1.setOrderAmount(250);
		order1.setOrderDate("14-Apr-2020");
		orderList.add(order1);
		
		OrdersResponseTO order2 = new OrdersResponseTO();
		order2.setOrderId(2);
		order2.setOrderAmount(450);
		order2.setOrderDate("15-Apr-2020");
		orderList.add(order2);
		
		return orderList;
		
	}

}
