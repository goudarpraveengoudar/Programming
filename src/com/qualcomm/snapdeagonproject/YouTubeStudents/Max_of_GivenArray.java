package com.qualcomm.snapdeagonproject.YouTubeStudents;

public class Max_of_GivenArray {

    /**
     * Question : Find the maximum values for given values
     */
    public static void main (String [ ] args){
        int [] arr = { 10,2,33,290,50 };
        int max = arr[0];
       //  int max = Integer.  MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>max){
                max =arr[i];
            }
        }
        System.out.println(max);
    }




}
