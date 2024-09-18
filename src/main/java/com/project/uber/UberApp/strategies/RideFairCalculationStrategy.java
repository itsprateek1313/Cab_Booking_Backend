package com.project.uber.UberApp.strategies;

import com.project.uber.UberApp.dto.RideRequestDto;
import com.project.uber.UberApp.entities.RideRequest;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
public interface RideFairCalculationStrategy {

    double RIDE_FAIR_MULTIPLIER = 10;

    double calculateFare(RideRequest rideRequest);
}
