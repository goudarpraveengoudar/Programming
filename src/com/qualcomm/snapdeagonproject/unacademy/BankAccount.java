package com.qualcomm.snapdeagonproject.unacademy;

public class BankAccount {
    public String accountHolderName;
    private int balance;
    private String emailId;
    private String phoneNumber;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", emailId='" + emailId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void openAccount() {
        // do account activities : do customer verification, save in the db
        System.out.println("Account opened for "  + accountHolderName);
    }

    public void checkBalance() {
        System.out.println("Account balance is " + balance);
    }

    public void withDrawMoney(int amount) {
        if (balance > amount) {
            balance = balance - amount;
            System.out.println(amount + " rupees withdrawn from account");

        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void addMoney(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(amount + "Rupees added to account, " +
                    "updated balance is " + balance);
        } else {
            System.out.println("Can't add money");
        }
    }
}


