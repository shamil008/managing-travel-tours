package com.example.managingtraveltours.dao.repository;

import com.example.managingtraveltours.dao.entity.GuideEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuideRepository extends JpaRepository<GuideEntity,Long> {
}
