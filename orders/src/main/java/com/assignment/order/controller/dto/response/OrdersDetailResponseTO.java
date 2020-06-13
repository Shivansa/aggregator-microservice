package com.assignment.order.controller.dto.response;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class OrdersDetailResponseTO implements Serializable {
    /**
     * The serialVersionUID.
     */
    private static final long serialVersionUID = 4680657923739685454L;

    private List<OrdersResponseTO> orders;
    
}
