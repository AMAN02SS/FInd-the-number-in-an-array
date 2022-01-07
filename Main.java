package com.AmanSinghSikarwar;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20,40,10,80,70,45,30};
        int num = 40;

        for(int i=0;i<arr.length;i++) {
            if (num == arr[i]) {
                System.out.println("Number " + num + " is at index of " + i);
            }

        }
        


    }
}
