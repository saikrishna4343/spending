package com.spending.traxker.service;

import com.spending.traxker.dto.Spending;
import com.spending.traxker.entity.SpendingEntity;
import com.spending.traxker.functions.SpendingFunctions;
import com.spending.traxker.repository.SpendingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SpendingService {

    SpendingRepository spendingRepository;
    public Spending addNewSpending(Spending spending) {
        spending.setSpendingId(UUID.randomUUID());
        spending.setPaymentDate(ZonedDateTime.now());
        return SpendingFunctions.fromEntity
                .apply(spendingRepository.save(SpendingFunctions.toEntity.apply(spending)));
    }

    public List<Spending> addMultipleNewSpending(List<Spending> spendings){
        spendings = spendings.stream().map(e -> addUUIDAndDate(e)).collect(Collectors.toList());
        List<SpendingEntity> spendingEntityList = spendings.stream()
                .map(e -> SpendingFunctions.toEntity.apply(e)).collect(Collectors.toList());
       List<SpendingEntity> savedList =  spendingRepository.saveAll(spendingEntityList);
       return savedList.stream().map(e -> SpendingFunctions.fromEntity.apply(e)).collect(Collectors.toList());

    }

    public Spending addUUIDAndDate (Spending spending){
        spending.setSpendingId(UUID.randomUUID());
        spending.setPaymentDate(ZonedDateTime.now());
        return spending;
    }
}
