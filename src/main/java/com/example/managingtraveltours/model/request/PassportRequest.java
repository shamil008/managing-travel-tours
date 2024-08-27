package com.example.managingtraveltours.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassportRequest {
    private String passportNumber;

    private LocalDateTime issueDate;

    private LocalDateTime expiryDate;

    private String country;
}
