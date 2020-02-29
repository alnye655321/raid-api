package com.unrealtracker.raidapi.repository;


import com.unrealtracker.raidapi.model.WeddingRes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeddingResRepository extends JpaRepository<WeddingRes, Long> {
}