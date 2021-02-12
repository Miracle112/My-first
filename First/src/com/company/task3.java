package com.company;

import java.util.Scanner;
public class task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = String.valueOf(in.nextInt());
        int b = a.length();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < b; i++) {
            if (i % 2 == 0) {
                sum1 += Integer.parseInt(a.substring(i, i + 1));
            } else {
                sum2 += Integer.parseInt(a.substring(i, i + 1));
            }
        }
        if ((sum1 - sum2) % 11 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        }
    }