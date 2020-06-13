package com.assignment.aggregator.services;

import com.assignment.aggregator.controller.dto.response.AggregatorsDetailResponseTO;

public interface AggregatorsService {

	AggregatorsDetailResponseTO getAggregatorsDetail(int userId);
}
