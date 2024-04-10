package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_tbl2")
public class Account {

    @Id
    @Column(name="accountno")
    private int accountNumber;

    @Column(name="accountholdername")
    private String accountHolderName;

    @Column(name="accountbalance")
    private double accountBalance;

    public Account(){
        System.out.println("Account ctor");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountbalance2) {
        this.accountBalance = accountbalance2;
    }

    public Account(int accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }


    
}
