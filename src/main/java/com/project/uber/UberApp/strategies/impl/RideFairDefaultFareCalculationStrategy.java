package com.project.uber.UberApp.strategies.impl;

import com.project.uber.UberApp.dto.RideRequestDto;
import com.project.uber.UberApp.entities.RideRequest;
import com.project.uber.UberApp.services.impl.DistanceServiceOSRMImpl;
import com.project.uber.UberApp.strategies.RideFairCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideFairDefaultFareCalculationStrategy implements RideFairCalculationStrategy {

    private final DistanceServiceOSRMImpl distanceService;

    @Override
    public double calculateFare(RideRequest rideRequest) {
        double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(),rideRequest.getDestinationLocation());
        return distance*RIDE_FAIR_MULTIPLIER;
    }
}
