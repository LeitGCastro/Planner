package com.rocketseat.planner.trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.UUID;

@Service
public class TripService {

    @Autowired
    private TripRepository repository;

    public Trip createLink(TripRequestPayload payload){
        Trip newTrip = new Trip(payload);
        this.repository.save(newTrip);
        return newTrip;
    }

}
