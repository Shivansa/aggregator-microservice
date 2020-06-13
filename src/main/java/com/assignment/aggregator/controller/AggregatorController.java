package com.assignment.aggregator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.aggregator.controller.dto.response.AggregatorsDetailResponseTO;
import com.assignment.aggregator.services.AggregatorsService;


@RestController
@RequestMapping(value = "/orderdetails")
public class AggregatorController {
	
	@Autowired
	AggregatorsService aggregatorsService;

	@GetMapping("/{userId}")
	public ResponseEntity<AggregatorsDetailResponseTO> getAggregatorsDetail(@PathVariable(value = "userId") int userId) {
		AggregatorsDetailResponseTO responseTO = aggregatorsService.getAggregatorsDetail(userId);
		return new ResponseEntity<>(responseTO, HttpStatus.OK);
	}

}
