package com.shahriar;

import java.util.Scanner;

public class Airport {
    private int ch;
    private char z;
    private Scanner in = new Scanner(System.in);

    public void checkin(){
        System.out.println("Please type 1 for ((first class))");
        System.out.println();
        System.out.println("Please type 2 for ((Economy))");
        System.out.println();
        System.out.print("your choice: ");
        ch = in.nextInt();

        System.out.println(ch);

    }
}
