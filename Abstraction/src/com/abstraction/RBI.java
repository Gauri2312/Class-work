package com.abstraction;
//interface has only declaration to methods
public interface RBI {
     int min_balance=100;  //by default variables are static
     public void debit();
     public void credit();
     public void moneyTransfer();
}
