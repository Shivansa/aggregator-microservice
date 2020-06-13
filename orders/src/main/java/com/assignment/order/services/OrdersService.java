package com.assignment.order.services;

import com.assignment.order.controller.dto.response.OrdersDetailResponseTO;

public interface OrdersService {

	OrdersDetailResponseTO getOrdersDetail(long orderId);
}
