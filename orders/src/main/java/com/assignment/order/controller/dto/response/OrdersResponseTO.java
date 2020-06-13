package com.assignment.order.controller.dto.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class OrdersResponseTO implements Serializable {
    /**
     * The serialVersionUID.
     */
    private static final long serialVersionUID = 4680657923739685454L;

    private Long orderId;
    private Long orderAmount ;
    private String orderDate;
    
}
