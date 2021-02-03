package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	System.out.println("input x");
	Scanner in = new Scanner(System.in);
	int x = in.nextInt();
	System.out.println("input y");
	int y = in.nextInt();
	double z1 = Math.pow(Math.cos(x), 4) + Math.pow(Math.sin(y), 2) + 0.25 * Math.pow(Math.sin(2 * x), 2) - 1;
	System.out.println(z1);
    }
}
