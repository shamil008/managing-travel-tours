package com.example.managingtraveltours.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;

import java.time.LocalDateTime;
import java.util.Date;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "passport")
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PassportEntity {
    @Id
    private Long id;

    private String passportNumber;

    private Date issueDate;

    private Date expiryDate;

    private String country;

    @OneToOne(fetch = LAZY)
    @MapsId
    @JoinColumn(name = "id")
    @ToString.Exclude
    private GuideEntity guide;
}
