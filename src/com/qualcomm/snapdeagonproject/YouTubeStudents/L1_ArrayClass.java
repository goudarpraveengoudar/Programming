package com.qualcomm.snapdeagonproject.YouTubeStudents;

import java.util.Arrays;

public class L1_ArrayClass {

    public static void main(String[] args) {
        /**
         * No actual array exit as of now .
         * No memory has been allocated to arr in the RAM
         */
        int[] arr;
        arr = new int[5];
        System.out.println(arr);
        //length
        System.out.println(arr.length);

        //get
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[4]);

//set
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[4]);

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        //enhanced for loops
        //only for reading values from the array
        System.out.println();
        for (int val : arr) {
            System.out.println(val + "");
        }
    }


}
