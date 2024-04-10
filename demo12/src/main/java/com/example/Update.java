package com.example;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {

    public static void main(String[] args){
         EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");

         EntityManager em=emf.createEntityManager();

         EntityTransaction trans=em.getTransaction();

         trans.begin();
          System.out.println("enter the account no to be modified");
          Scanner sc1=new Scanner(System.in);
          int accountno=sc1.nextInt();

          Account account1=em.find(Account.class,accountno);
           

          if(account1==null)
          {
            System.out.println("account not found");
          }
else{
        Scanner sc2=new Scanner(System.in);
        Scanner sc3=new Scanner(System.in);


        System.out.println("enter new account holder name");
        String accountholdername=sc2.next();

        System.out.println("enter new account balance");
        double accountbalance=sc3.nextDouble();

        account1.setAccountBalance(accountbalance);
        account1.setAccountHolderName(accountholdername);

}
        em.merge(account1);
        System.out.println("object modified");
        trans.commit();
        em.close();


    }
    
}
