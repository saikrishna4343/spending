package com.spending.traxker.repository;

import com.spending.traxker.entity.SpendingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpendingRepository extends JpaRepository<SpendingEntity, Integer> {
    SpendingEntity  findBySpendingId(UUID spendingId);
}
