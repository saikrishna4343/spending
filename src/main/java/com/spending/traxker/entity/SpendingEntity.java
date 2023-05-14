package com.spending.traxker.entity;

import com.spending.traxker.enums.PaymentFromType;
import com.spending.traxker.enums.SpendingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "spending")
@Entity
public class SpendingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "spending_id")
    private UUID spendingId;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "paid_from")
    private String paidFrom;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_from_type")
    private PaymentFromType paymentFromType;

    @Column(name = "payment_date")
    private ZonedDateTime paymentDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_spending_type")
    private SpendingType paymentSpendingType;

    @Column(name = "payment_spending_comment")
    private String paymentSpendingComment;
}
