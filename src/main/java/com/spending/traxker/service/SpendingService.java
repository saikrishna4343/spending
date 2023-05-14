package com.spending.traxker.service;

import com.spending.traxker.dto.Spending;
import com.spending.traxker.functions.SpendingFunctions;
import com.spending.traxker.repository.SpendingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
public class SpendingService {

    SpendingRepository spendingRepository;
    public Spending addNewSpending(Spending spending) {
        spending.setSpendingId(UUID.randomUUID());
        spending.setPaymentDate(ZonedDateTime.now());
        return SpendingFunctions.fromEntity.apply(spendingRepository.save(SpendingFunctions.toEntity.apply(spending)));
    }
}
