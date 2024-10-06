package com.project.uber.UberApp.dto;
import com.project.uber.UberApp.entities.enums.PaymentMethod;
import com.project.uber.UberApp.entities.enums.RideStatus;

import lombok.Data;
import org.locationtech.jts.geom.Point;
import java.time.LocalDateTime;


//Contains all details about the Ride
@Data
public class RideDto {

    private int id;
    private PointDto pickupLocation;
    private PointDto destinationLocation;
    private LocalDateTime createdTime;
    private RiderDto rider;
    private DriverDto driver;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private String otp;
    private Double fair;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
