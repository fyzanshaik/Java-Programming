package com.fyzan;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
            Syntax of for loops:

            for (initialization; condition; increment/decrement;) {
                //body
             }
         */
        // Q : Print numbers from 1 to 5:

//        for (int num = 1; num <=5; num++ ) {
//            System.out.println(num );
        
        //Q : Print numbers from 1 to n:

        Scanner in = new Scanner(System.in);
//        System.out.println("Enter any number: ");
//        int n = in.nextInt();
//
//
//        for (int num = 0; num <= n; num++) {
////            System.out.print(num + " ");
//            System.out.println("Hi Hi Hi ");



        int num = 1;
        while (num <= 5) {
//            System.out.println(num);
            num++;
            
        }


        //while loops:
        /*
            Syntax :
            while (condition) {
                body
            }
         */

        //DO WHILE LOOP:
        /*
        Syntax:
        do {

            } while (condition);
         */
        int n = 1;
        do {
            System.out.print("Hi" + " ");
            n++;
//Only runs 7 times only if the while condition is true
        } while (n<=7);
    }






    }

