package com.project.uber.UberApp.strategies;


import com.project.uber.UberApp.strategies.impl.DriverMatchingHighestRatedDriverStrategy;
import com.project.uber.UberApp.strategies.impl.DriverMatchingNearestDriverStrategy;
import com.project.uber.UberApp.strategies.impl.RideFairDefaultFareCalculationStrategy;
import com.project.uber.UberApp.strategies.impl.RideFairSurgePricingFairCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.time.LocalTime;

@Component
@RequiredArgsConstructor
public class RideStrategyManager {
    private final DriverMatchingHighestRatedDriverStrategy highestRatedDriverStrategy;
    private final DriverMatchingNearestDriverStrategy nearestDriverStrategy;
    private final RideFairDefaultFareCalculationStrategy defaultFareCalculationStrategy;
    private final RideFairSurgePricingFairCalculationStrategy surgePricingFareCalculationStrategy;

    public DriverMatchingStrategy driverMatchingStrategy(double riderRating) {
        if(riderRating >= 4.8) {
            return highestRatedDriverStrategy;
        } else {
            return nearestDriverStrategy;
        }
    }

    public RideFairCalculationStrategy rideFareCalculationStrategy() {
//        6PM to 9PM is SURGE TIME
        LocalTime surgeStartTime = LocalTime.of(18, 0);
        LocalTime surgeEndTime = LocalTime.of(21, 0);
        LocalTime currentTime = LocalTime.now();

        boolean isSurgeTime = currentTime.isAfter(surgeStartTime) && currentTime.isBefore(surgeEndTime);

        if(isSurgeTime) {
            return surgePricingFareCalculationStrategy;
        } else {
            return defaultFareCalculationStrategy;
        }
    }
}
