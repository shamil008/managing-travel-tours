package com.example.managingtraveltours.dao.repository;

import com.example.managingtraveltours.dao.entity.TourEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TourRepository extends JpaRepository<TourEntity,Long> {
    @Override
    @EntityGraph(attributePaths = {"guides"},type = EntityGraph.EntityGraphType.FETCH)
    Optional<TourEntity> findById(Long tourId);
}
