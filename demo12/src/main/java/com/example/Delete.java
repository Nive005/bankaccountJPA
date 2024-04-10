package com.example;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
 public static void main(String[] args){
    //System.out.println("entity manager factory created");
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");

    EntityManager em=emf.createEntityManager();

    EntityTransaction trans=em.getTransaction();
    trans.begin();
    System.out.println("enter the account to be deleted");
    Scanner sc1=new Scanner(System.in);
    int accountno=sc1.nextInt();

    Account accoun1=em.find(Account.class,accountno);

    if(accoun1==null)
    {
        System.out.println("account not found");
    }

    else{
        em.remove(accoun1);
        trans.commit();
        System.out.println("row got deleted");
    }

    em.close();
    
 }
}
