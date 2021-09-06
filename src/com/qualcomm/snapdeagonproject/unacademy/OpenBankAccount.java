package com.qualcomm.snapdeagonproject.unacademy;

public class OpenBankAccount {
    public String accountHolderName;
    private String emailId;
    private int balance;
    private String PhoneNumber;
    //public int amount;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public void openAccount(){
        System.out.println("Open account for "   +  accountHolderName);
    }
    public void checkBalance(){
        System.out.println("Account balance is " +  balance);
    }
    public void addMoney (int amount){
        if(amount > 0){
            balance = balance+amount;
            System.out.println(amount + "added to your account," +
                    " updated balance is "  +  balance);
        }else {
            System.out.println("Can't add money to account");
        }
    }
    public void withdrawMoney(int amount){
        if (balance > amount){
            balance = balance-amount;
            System.out.println(amount + " Rupees withdrawn your account, updated balance is " + balance);
        }else {
            System.out.println("Insufficient balance");
        }

    }

    @Override
    public String toString() {
        return "OpenBankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", balance=" + balance +
                ", PhoneNumber=" + PhoneNumber +
                '}';
    }
}
