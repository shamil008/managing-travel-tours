package com.example.managingtraveltours.dao.repository;

import com.example.managingtraveltours.dao.entity.TourEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<TourEntity,Long> {
}
