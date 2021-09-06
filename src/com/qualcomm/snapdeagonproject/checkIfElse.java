package com.qualcomm.snapdeagonproject;

public class checkIfElse {
    public static void main(String[] args) {
        int age = 40;
        int weight = 49;
        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("Not enough weight");
            }

        } else {
            System.out.println("You are not eligible to donate blood");
        }
    }
}
