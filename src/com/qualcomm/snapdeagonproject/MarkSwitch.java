package com.qualcomm.snapdeagonproject;

public class MarkSwitch {
    public static void main(String[] args) {
        int gateMarks = 50;
        int myMarks = 50;
        switch (gateMarks) {

            //case myMarks:
             //   System.out.println("Scored 50 marks");
             //   break;
            case 60:
                System.out.println("Scored 60 marks");
                break;

            case 70:
                System.out.println("Scored 70 marks");
                break;
            default:
                System.out.println("Marks not received");
        }


    }
}