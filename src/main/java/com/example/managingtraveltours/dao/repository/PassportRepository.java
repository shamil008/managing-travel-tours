package com.example.managingtraveltours.dao.repository;

import com.example.managingtraveltours.dao.entity.PassportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<PassportEntity,Long> {
}
