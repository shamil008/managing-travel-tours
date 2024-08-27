package com.example.managingtraveltours.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TourRequest {
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
