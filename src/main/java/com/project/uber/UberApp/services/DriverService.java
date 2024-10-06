package com.project.uber.UberApp.services;

import com.project.uber.UberApp.dto.DriverDto;
import com.project.uber.UberApp.dto.RideDto;
import com.project.uber.UberApp.entities.Driver;

import java.util.List;
import java.util.Optional;

public interface DriverService {


    RideDto acceptRide(Long rideRequestId);
    RideDto cancelRide(Long rideId);
    RideDto startRide(Long rideId,String otp);
    RideDto endRide(Long rideId);
    RideDto rateRider(Long rideId, Integer rating);
    DriverDto getMyProfile();
    List<RideDto> getAllMyRides();
    Driver getCurrentDriver();



}
