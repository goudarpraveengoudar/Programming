package com.qualcomm.snapdeagonproject;

public class LearnSwitchStatement {
    public static void main (String [] args){
        String dreamCompany = "Apple";
        switch (dreamCompany){
            case "Google":
                System.out.println("Google is my dream company");
                break;
            case "Amazon":
                System.out.println("Amazon is my dream company");
                break;
            default:
                System.out.println("i am ready to work for any of these");
            case "Microsoft":
                System.out.println("Microsoft is my dream company");
                break;
        }
    }
}
