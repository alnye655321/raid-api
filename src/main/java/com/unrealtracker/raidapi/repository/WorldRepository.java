package com.unrealtracker.raidapi.repository;

import com.unrealtracker.raidapi.model.World;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorldRepository extends JpaRepository<World, Long> {
}
