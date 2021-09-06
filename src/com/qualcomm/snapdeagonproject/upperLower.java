package com.qualcomm.snapdeagonproject;

public class upperLower {
    public static void main (String [] args){
        char ch ='R';
        if (ch>= 'a' && ch <='z'){
            System.out.println("Lower");

        }else if (ch >= 'A' && ch <='Z'){
            System.out.println("Upper");
        }else {
            System.out.println("Invalid");
        }

    }
}
