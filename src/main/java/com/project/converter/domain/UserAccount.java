package com.project.converter.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class UserAccount {

    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "id")
    @MapsId
    private User user;



    @OneToOne
    @JoinColumn(name = "PLNACCOUNT_ID")
    private PLNAccount plnAccount;



    @OneToOne
    @JoinColumn(name = "EURACCOUNT_ID")
    private EURAccount eurAccount;


    //Add when transaction Entity added
    /*
    @OneToMany
    @JoinColumn(name = "TRANSACTIONS")
    private List<Transaction> transactions;
    */
}
