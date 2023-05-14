package com.spending.traxker.functions;

import com.spending.traxker.dto.Spending;
import com.spending.traxker.entity.SpendingEntity;

import java.util.function.Function;

public class SpendingFunctions {

    public static Function<Spending, SpendingEntity> toEntity = spending ->
            SpendingEntity.builder()
                    .spendingId(spending.getSpendingId())
                    .amount(spending.getAmount())
                    .paidFrom(spending.getPaidFrom())
                    .paymentFromType(spending.getPaymentFromType())
                    .paymentDate(spending.getPaymentDate())
                    .paymentSpendingType(spending.getPaymentSpendingType())
                    .paymentSpendingComment(spending.getPaymentSpendingComment())
                    .build();

    public static Function<SpendingEntity, Spending> fromEntity = spendingEntity ->
            Spending.builder()
                    .spendingId(spendingEntity.getSpendingId())
                    .amount(spendingEntity.getAmount())
                    .paidFrom(spendingEntity.getPaidFrom())
                    .paymentFromType(spendingEntity.getPaymentFromType())
                    .paymentDate(spendingEntity.getPaymentDate())
                    .paymentSpendingType(spendingEntity.getPaymentSpendingType())
                    .paymentSpendingComment(spendingEntity.getPaymentSpendingComment())
                    .build();
}
