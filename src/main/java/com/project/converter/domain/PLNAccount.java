package com.project.converter.domain;

import com.project.converter.Currency;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;


@NoArgsConstructor
@Getter
@Entity
@Table(name = "PLN_ACCOUNT")
public class PLNAccount {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "CURRENCY")
    @Enumerated(EnumType.STRING)
    private Currency currency = Currency.PLN;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @OneToOne(mappedBy = "plnAccount")
    private UserAccount userAccount;




}
