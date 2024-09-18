package com.project.uber.UberApp.dto;
import com.project.uber.UberApp.entities.enums.PaymentMethod;
import com.project.uber.UberApp.entities.enums.RideStatus;

import org.locationtech.jts.geom.Point;
import java.time.LocalDateTime;


//Contains all details about the Ride
public class RideDto {

    private int id;
    private Point pickupLocation;
    private Point destinationLocation;
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
