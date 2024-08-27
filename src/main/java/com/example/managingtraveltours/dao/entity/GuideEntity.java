package com.example.managingtraveltours.dao.entity;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "guides")
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GuideEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    private String name;

    private String email;

    private String phoneNumber;

    @OneToOne(
            mappedBy = "guide",
            cascade = ALL,
            fetch = LAZY
    )
    @ToString.Exclude
    private PassportEntity passport;
}
