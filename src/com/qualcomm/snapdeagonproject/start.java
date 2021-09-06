package com.qualcomm.snapdeagonproject;

public class start {
    public static int main (String [] args){
        int z =4 ;
        int i = func1(z, 1) - 3;
        return i;
    }

    private static int func1(int a, int b) {
        int n =a+b;
        return 2 + func2(n);
    }

    private static int func2(int w) {
        return w*3;
    }
}
