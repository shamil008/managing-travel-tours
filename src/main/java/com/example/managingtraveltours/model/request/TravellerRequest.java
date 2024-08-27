package com.example.managingtraveltours.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TravellerRequest {
    private String firstName;
    private String lastName;
    private String email;
}
