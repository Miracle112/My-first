package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class task6 {

    public static void main(String[] args) {
        int[] para = new int[2];
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int k1 = in.nextInt();
        int n = 0;
        for (int i = k; i < k1; i++){
            for (int j = 1; j < i + 1; j++){
                if (i % j == 0){
                    n += 1;
                }
            }
            if (n == 2){
                n = 0;
                for (int l = 1; l < i+3; l++){
                    if ((i + 2) % l == 0){
                        n += 1;
                    }
                    }
                if (n == 2){
                    System.out.println(i);
                    System.out.println(i + 2);
                    System.out.println("---------");
                }

            }
            n = 0;
        }
    }
}