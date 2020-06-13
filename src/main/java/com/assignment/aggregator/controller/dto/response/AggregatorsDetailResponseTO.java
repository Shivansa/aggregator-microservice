package com.assignment.aggregator.controller.dto.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class AggregatorsDetailResponseTO extends OrdersDetailsResponseTO implements Serializable {
    /**
     * The serialVersionUID.
     */
    private static final long serialVersionUID = 4680657923739685454L;

    private UsersDetailResponseTO userDetails;
    
}
