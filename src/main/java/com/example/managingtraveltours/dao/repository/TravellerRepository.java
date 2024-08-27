package com.example.managingtraveltours.dao.repository;

import com.example.managingtraveltours.dao.entity.TravellerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravellerRepository extends JpaRepository<TravellerEntity,Long> {
}
