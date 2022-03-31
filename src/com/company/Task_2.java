package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

public class Task_2 {

    public static void main(String[] args) {
        int max = 0, min=0 ;
        int[] mmnum = new int[10];

        for (int i=0; i<mmnum.length;i++) {
            mmnum[i] = (int) (Math.random() * 100);
            System.out.print((mmnum[i] + " "));
            if (max < mmnum[i])
            {
                max = mmnum[i];
            }
            if (min == 0)
            {
                min = mmnum[i];
            }
        }



        System.out.println("");

        System.out.println("maximum number = "+max);
        System.out.println("minimum number = "+min);

    }



}