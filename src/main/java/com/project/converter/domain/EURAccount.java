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
@Table(name = "EURO_ACCOUNT")
public class EURAccount {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "CURRENCY")
    @Enumerated(EnumType.STRING)
    private Currency currency = Currency.EUR;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @OneToOne(mappedBy = "eurAccount")
    private UserAccount userAccount;
}
