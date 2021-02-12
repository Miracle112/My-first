package com.company;

import java.util.Scanner;
public class task4 {

    public static void main(String[] args) {
        System.out.println("input number");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        for (int i = 10; i < k; i++){
            String a = Integer.toString(i);
            int len = a.length();
            String e = "";
            for (int j = 0; j < len; j++){
                int len1 = len - (j + 1);
                e = e + a.charAt(len1);
            }
            int e1 = Integer.parseInt(e);
            if (e1 + i == k){
                System.out.println(i);
            }
        }
    }
}