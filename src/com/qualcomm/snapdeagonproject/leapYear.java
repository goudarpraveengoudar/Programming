package com.qualcomm.snapdeagonproject;

public class leapYear {
public static void main(String[] args){
    /**
     * A year is leap year if any of the following condition are true
     * 1.If it is divisible by 4 and not divisible 100.
     * 2. If it is divisible by 400
     */
    int year = 2015;
    if ((year % 4 ==0)&& (year % 100 !=0)||(year % 400 ==0)){
        System.out.println("Leap year");
    }else {
        System.out.println("Not a leap year");
    }
}
/**
 * Logical AND - && (Boolean Comparison)
 * Bitwise AND - & (Bitwise Comparison)
 */


}
