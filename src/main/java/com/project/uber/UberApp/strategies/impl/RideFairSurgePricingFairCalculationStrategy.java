package com.project.uber.UberApp.strategies.impl;

import com.project.uber.UberApp.dto.RideRequestDto;
import com.project.uber.UberApp.entities.RideRequest;
import com.project.uber.UberApp.strategies.RideFairCalculationStrategy;

public class RideFairSurgePricingFairCalculationStrategy implements RideFairCalculationStrategy {
    @Override
    public double calculateFare(RideRequest rideRequest) {
        return 0;
    }
}
