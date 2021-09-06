package com.qualcomm.snapdeagonproject;

public class Prime {

    public static void main (String[] args){
        int num =85;
        boolean flag = true;
         for ( int div =2; div <= num-1; div ++) {
             int rem = num % div;
             if (rem == 0) {
                 flag = false;
                 break;
             }
         }
         if (flag == true){
             System.out.println("Prime");
         }else {
             System.out.println("Not Prime");

         }
    }
}
