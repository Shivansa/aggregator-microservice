package com.assignment.aggregator.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.assignment.aggregator.controller.dto.response.AggregatorsDetailResponseTO;
import com.assignment.aggregator.controller.dto.response.OrdersDetailsResponseTO;
import com.assignment.aggregator.controller.dto.response.UsersDetailResponseTO;

@Service
public class AggregatorServiceImpl implements AggregatorsService {

	private static final Logger LOGGER = LoggerFactory.getLogger(AggregatorsService.class);

	public AggregatorsDetailResponseTO getAggregatorsDetail(int userId) {
		return getAggregatorsList(userId);
	}
	
	private AggregatorsDetailResponseTO getAggregatorsList(int userId){
		AggregatorsDetailResponseTO orders = new AggregatorsDetailResponseTO();
		RestTemplate restTemplate = new RestTemplate();
		LOGGER.info("ORDER_APP_URL "+System.getenv("ORDER_APP_URL") );
		
		String orderPath = System.getenv("ORDER_APP_URL") != null ? System.getenv("ORDER_APP_URL") : "http://localhost:8086";
		LOGGER.info("USER_APP_URL "+System.getenv("USER_APP_URL") );
		ResponseEntity<OrdersDetailsResponseTO> orderResponse = restTemplate.getForEntity(orderPath + "/orders/1", OrdersDetailsResponseTO.class);

		String userPath = System.getenv("USER_APP_URL") != null ? System.getenv("USER_APP_URL") : "http://localhost:8088";

		
		ResponseEntity<UsersDetailResponseTO> userResponse = restTemplate.getForEntity(userPath + "/user/1", UsersDetailResponseTO.class);
		orders.setOrders(orderResponse.getBody().getOrders());
		orders.setUserDetails(userResponse.getBody());

		return orders;
		
	}
}
