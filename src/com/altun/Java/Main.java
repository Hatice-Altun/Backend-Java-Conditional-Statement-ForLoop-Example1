package com.altun.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Write a program in Java to display the multiplication table of a given integer.

        System.out.println("Welcome!");
        System.out.println("Input the number of your table for multiplication: ");

        Scanner userInteraction = new Scanner(System.in);

        int j,n;
        n = userInteraction.nextInt();

        System.out.println ("\n");
        for(j=0;j<=n;j++)

            System.out.println(n+" X "+j+" = " +n*j);

    }
}
