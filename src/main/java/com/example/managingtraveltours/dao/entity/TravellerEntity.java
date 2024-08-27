package com.example.managingtraveltours.dao.entity;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "travellers")
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TravellerEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String firstName;

    private  String lastName;

    private String email;
}
