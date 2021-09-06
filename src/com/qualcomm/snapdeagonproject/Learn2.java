package com.qualcomm.snapdeagonproject;

public class Learn2 {
    public static void main (String [] args){
        String brand = "Samsung";
        switch (brand){
            case "Apple":
                System.out.println("Apple phone");
                break;
            case "Samsung":
                System.out.print("Samsung Phone");
                break;
            case "Motorola":
                System.out.println("Motorola Phone");
                break;
            case "OnePlus":
                System.out.println("OnePlus Phone");
                break;
            default:
                System.out.println("Some other Phone");
                break;
        }
    }
}
