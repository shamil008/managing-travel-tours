package com.example.managingtraveltours.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TourResponse {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
