package com.example.managingtraveltours.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.apache.logging.log4j.util.Lazy;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;

import javax.annotation.processing.Generated;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "destinations")
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DestinationEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String location;

    private String description;

    private LocalDateTime visitDate;

    @ManyToOne(fetch = LAZY)
    @ToString.Exclude
    private TourEntity tour;
}
