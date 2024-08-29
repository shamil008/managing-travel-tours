package com.example.managingtraveltours.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DestinationRequest {
    private String location;
    private String description;
    private Date visitDate;
    private Long tourId;
}
