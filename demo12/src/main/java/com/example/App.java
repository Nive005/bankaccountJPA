package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println("create entity manager factory");
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
    System.out.println("entity manager factory created");

    System.out.println("create entity manager");
    EntityManager em=emf.createEntityManager();
    System.out.println("entity manager created");

    EntityTransaction trans=em.getTransaction();
    trans.begin();
   // Account account=new Account();
    //account.setAccountNumber(102);
   // account.setAccountHolderName("Nivi");
    //account.setAccountBalance(200000);
   
    /*Account account4=new Account();
    account4.setAccountNumber(108);
    account4.setAccountHolderName("yashu");
    account4.setAccountBalance(50000);*/
   // Account account1=new Account(105,"Yashu",20000);
    Account account2=new Account(103,"Keerthi",50000);
    Account account3=new Account(104,"Pannaga",300000);
   
   // em.persist(account1);
    em.persist(account2);
    em.persist(account3);
    trans.commit();
    em.close();


    }
}
