package com.shahriar;

import java.util.*;

public class Airport {
    //all variables
    private int R, G;
    private int A = 5;
    private char z;
    private boolean h = true;
    private int[] Firstclass = {0, 0, 0, 0, 0};
    private int[] Economy = {0, 0, 0, 0, 0};
    private Scanner in = new Scanner(System.in);
    private Random rand = new Random();

    //variables are we need for checking all
    private List<Integer>full;
    private List<Integer>fullcheck;
    private List<Integer>full2;
    private List<Integer>fullcheck2;

    //main methods of this program
    public void checkin() {

        //create arraylists
        full = new ArrayList();
        fullcheck = new ArrayList();

        //check first class full
        fullcheck.add(0);
        fullcheck.add(1);
        fullcheck.add(2);
        fullcheck.add(3);
        fullcheck.add(4);

        full2 = new ArrayList();
        fullcheck2 = new ArrayList();

        //check economy class full
        fullcheck2.add(5);
        fullcheck2.add(6);
        fullcheck2.add(7);
        fullcheck2.add(8);
        fullcheck2.add(9);

        //booking
        while (h == true) {
            System.out.println("Please type 1 for ((first class))\n");
            System.out.println("OR\n");
            System.out.println("Please type 2 for ((Economy))\n");
            System.out.print("your choice: ");
            R = in.nextInt();

            if (R == 1) {
                firstclass();
            } else if (R == 2) {
                Economy();
            }
        }
    }

    //first class booking
    private void firstclass() {


        doFirst:
        while (true) {
            //choose random sitting number
            G = rand.nextInt(A);


            if (full.contains(G)) {
                //check first class full
                if (full.containsAll(fullcheck)) {
                    Fullfirst();
                    break doFirst;
                } else {
                    continue doFirst;
                }

            } else {
                Firstclass[G] = 1;
                full.add(G);
                System.out.println("**your Chair's information**");
                System.out.println("Class: first class\nNumber: " + (G + 1));
                System.out.println("***************************************************************");
                break doFirst;
            }


        }


    }

    //economy class booking
    private void Economy() {


        doEconomy:
        while (true) {
            //choose random sitting number
            G = rand.nextInt(A);


            //check economy class full
            if (full2.contains(G + 5 )) {
                if (full2.containsAll(fullcheck2)) {
                    Fulleconomy();
                    break doEconomy;
                } else {
                    continue doEconomy;
                }

            } else {
                Economy[G] = 1;
                full2.add(G + 5);
                System.out.println("*your Chair's information*");
                System.out.println("Class: Economy\nNumber: " + (G + 6));
                System.out.println("***************************************************************");
                break doEconomy;
            }


        }
    }

    //when first class full
    private void Fullfirst() {
        System.out.println("sorry. The seats in the first class are full.");
        System.out.print("Would you like to book a seat in the (economy) section?[y, n] = ");
        z = in.next().charAt(0);

        if (z == 'y' || z == 'Y'){
            Economy();
        }else if (z == 'n' || z == 'N'){
            Full();
        }
        else{
            System.out.println("Error.Please enter the correct value");
            System.out.println("//////////////////////////////////////////////");
            Fullfirst();
        }
    }

    //when economy class full
    private void Fulleconomy(){
        System.out.println("sorry. The seats in the economy class are full.");
        System.out.print("Would you like to book a seat in the (first class) section?[y, n] = ");
        z = in.next().charAt(0);

        if (z == 'y' || z == 'Y'){
            firstclass();
        }else if (z == 'n' || z == 'N'){
            Full();
        }
        else{
            System.out.println("Error.Please enter the correct value");
            System.out.println("//////////////////////////////////////////////");
            Fulleconomy();
        }

    }



    // if user send no in Fullfirst and Fulleconomy methods
    private void Full() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Next flight leave in 3 hours");
        System.out.println("good buy");
        System.out.println("----------------------------------------------------------------");
        h = false;
    }
}
