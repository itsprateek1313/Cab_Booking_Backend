package com.project.uber.UberApp.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;
    Double balance;

    @OneToMany(mappedBy = "wallet", fetch = FetchType.LAZY)
    List<WalletTransaction> transactions;

}
