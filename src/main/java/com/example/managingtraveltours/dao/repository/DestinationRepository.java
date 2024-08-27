package com.example.managingtraveltours.dao.repository;

import com.example.managingtraveltours.dao.entity.DestinationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<DestinationEntity,Long> {
}
