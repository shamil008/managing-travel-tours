package com.example.managingtraveltours.controller;

import com.example.managingtraveltours.model.request.DestinationRequest;
import com.example.managingtraveltours.service.abstraction.DestinationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/destinations")
public class DestinationController {
    private final DestinationService destinationService;

    @PostMapping
    @ResponseStatus(CREATED)
    public  void createDestinations(@RequestBody DestinationRequest request){
        destinationService.createDestination(request);
    }
}
