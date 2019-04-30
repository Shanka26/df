/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import java.util.Date;

/**
 *
 * @author Shamarl Leonad
 */
public class Account {

private int id;
private double balance ;
private double annualInterestRate;
private java.util.Date dateCreated;

    public Account() {
        id=0;
        balance=0;
        annualInterestRate =0;
        
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate =0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

   public double getMonthlyInterestRate(){
   
       return annualInterestRate/12;
   }
   
   void withdraw(double mon){
       balance+=mon;
   }
   void deposit(double mon){
   balance-=mon;
   }





}
