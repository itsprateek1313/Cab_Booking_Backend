package com.project.uber.UberApp.services.impl;

import com.project.uber.UberApp.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {

    @Override
    public double calculateDistance(Point src, Point dest) {
        //Call the third party api OSRM to fetch distance
        return 0;
    }
}
