package com.company;

import java.util.Scanner;
public class task5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String k = in.nextLine();
        int kol_vo = 1;
        String fp = " ";
        String fp1 = " ";
        String alf = " abcdifghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < k.length(); i++) {
            char x1 = k.charAt(i);
            int x = alf.indexOf(x1);
            while (x >= 7) {
                kol_vo += 1;
                x -= 6;
            }
            if (kol_vo == 1) {
                fp = "a";
            } else if (kol_vo == 2) {
                fp = "d";
            } else if (kol_vo == 3) {
                fp = "f";
            } else if (kol_vo == 4) {
                fp = "g";
            } else if (kol_vo == 5) {
                fp = "v";
            } else if (kol_vo == 6) {
                fp = "x";
            }
            if (x == 1) {
                fp1 = "a";
            } else if (x == 2) {
                fp1 = "d";
            } else if (x == 3) {
                fp1 = "f";
            } else if (x == 4) {
                fp1 = "g";
            } else if (x == 5) {
                fp1 = "v";
            } else if (x == 6) {
                fp1 = "x";
            }
             String ok = fp + fp1 + " ";
            System.out.print(ok);
        }
    }
}