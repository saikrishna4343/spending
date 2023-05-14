package com.spending.traxker.dto;

import com.spending.traxker.enums.PaymentFromType;
import com.spending.traxker.enums.SpendingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Spending {
    private UUID spendingId;
    private BigDecimal amount;
    private String paidFrom;
    private PaymentFromType paymentFromType;
    private ZonedDateTime paymentDate;
    private SpendingType paymentSpendingType;
    private String paymentSpendingComment;
}
