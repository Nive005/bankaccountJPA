package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SelectAll {
    public static void main(String[] args){
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");

        EntityManager em=emf.createEntityManager();

        TypedQuery<Account> typedQuery=em.createQuery("from Account",Account.class);

        List<Account> accountList=typedQuery.getResultList();

        for(Account account:accountList){
            System.out.println("Account nov: " +account.getAccountNumber());
            System.out.println("Account holder name : " +account.getAccountHolderName());
            System.out.println("Account balance: "+account.getAccountBalance());




        }

    }
    
}
