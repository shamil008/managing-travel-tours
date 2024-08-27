package com.example.managingtraveltours.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DestinationRequest {
    private String location;
    private String description;
    private LocalDateTime visitDate;
    private Long tourId;
}
