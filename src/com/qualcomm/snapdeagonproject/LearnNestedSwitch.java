package com.qualcomm.snapdeagonproject;

public class LearnNestedSwitch {
    public static void main (String[] args){
        //nested switch example
        int a = 1;
        int b =2;
        switch (a){
            case 1:
                System.out.println(" value of a is 1");
                switch (b){
                    case 1:
                        System.out.println("value of b is 2");
                        break;
                    case 2:
                        System.out.println("value of b is 3");
                        break;
                    case 3:
                        System.out.println("value of b is 4");
                        break;
                    default:
                        System.out.println("value of b is 0");
                        break;
                }
                break;
            case 2:
                System.out.println("value of a is 2");
                break;
            case 3:
                System.out.println("value of a is 3");
            default:
                System.out.println("value of a is 0");
        }
    }


}
