package com.company;

import java.util.Scanner;
public class task1 {

    public static void main(String[] args) {
        System.out.println("input string");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        int len = x.length();
        int max = 0;
        int amount = 0;
        for(int i = 0; i < len; i++){
            if(x.charAt(0) == '0'){
                amount++;
                x = x.substring(1);
                if(amount > max){
                    max = amount;
                }
            }
            else{
                amount = 0;
                x = x.substring(1);
            }
        }
        System.out.println(max);
    }
}