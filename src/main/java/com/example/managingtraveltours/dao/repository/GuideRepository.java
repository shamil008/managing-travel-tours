package com.example.managingtraveltours.dao.repository;

import com.example.managingtraveltours.dao.entity.GuideEntity;
import com.example.managingtraveltours.dao.entity.TourEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GuideRepository extends JpaRepository<GuideEntity,Long> {
   
}
