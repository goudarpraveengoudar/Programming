package com.qualcomm.snapdeagonproject.unacademy;

public class Main {
    public static void main (String[] args){
       BankAccount bankAccount = new BankAccount() ;
       bankAccount.accountHolderName = "Praveenkumar Goudar";
       bankAccount.setBalance(0);
       bankAccount.setPhoneNumber("8904898357");
       bankAccount.setEmailId("goudarpraveen05@gmail.com");

       bankAccount.openAccount();
       bankAccount.checkBalance();

       bankAccount.addMoney(1000);
       bankAccount.withDrawMoney(500);
       bankAccount.checkBalance();
       bankAccount.withDrawMoney(2000);




       OpenBankAccount openBankAccount = new OpenBankAccount();
       openBankAccount.accountHolderName="Praveen S Goudar";
       openBankAccount.setBalance(5000);
       openBankAccount.setEmailId("goudarpraveenkumar@gmail.com");
       openBankAccount.setPhoneNumber("8904898357");

       openBankAccount.openAccount();
       openBankAccount.checkBalance();

       openBankAccount.addMoney( 6000);
       openBankAccount.withdrawMoney(600);
       openBankAccount.checkBalance();
       openBankAccount.withdrawMoney(9000);
    }

}
