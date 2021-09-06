package com.qualcomm.snapdeagonproject;
import org.jetbrains.annotations.NotNull;

import java.io.*;

public class Prime1 {
    public static void main (String @NotNull [] args){
        int i, j, count, n;

        n=Integer.parseInt(args[0]);
        System.out.println("Prime series is");
        for (i=1;i<=n; i++){
            count =0;
            for (j=2;j<i;j++){
                if (i%j==0){
                    count ++;
                }
            }
            if (count == 0){
                System.out.println(i);
            }
        }
    }

}
