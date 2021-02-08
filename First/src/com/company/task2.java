package com.company;

import java.util.Scanner;
public class task2 {

    public static void main(String[] args) {
        System.out.println("input amount");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        double amount = Math.pow(x, y);
        int amount1 = (int)amount;
        String str = String.valueOf(amount1);
        System.out.println(str);
        str = str.substring(str.length() - 1, str.length());
        System.out.println(str);
    }
}