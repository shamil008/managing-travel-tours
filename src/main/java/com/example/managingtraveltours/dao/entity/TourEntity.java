package com.example.managingtraveltours.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "tours")
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TourEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

    private LocalDateTime startDate;


    private  LocalDateTime endDate;

    @OneToMany(
            mappedBy = "tour",
            cascade = ALL
    )
    @ToString.Exclude
    List<DestinationEntity> destinations;

    @ManyToMany(cascade = ALL)
    @JoinTable(
            name = "tour_guide",
            joinColumns = @JoinColumn(name = "tour_id"),
            inverseJoinColumns = @JoinColumn(name = "guide_id")
    )
    @ToString.Exclude
    private List<GuideEntity> guides;

    @ManyToMany(cascade = ALL)
    @JoinTable(
            name = "tour_traveller",
            joinColumns = @JoinColumn(name="tour_id"),
            inverseJoinColumns = @JoinColumn(name ="traveller_id")

    )
    @ToString.Exclude
    private List<TravellerEntity> travellers;
}
