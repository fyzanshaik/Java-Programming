package com.fyzan;


import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        Syntax for 'for loops':

        for (initialization, condition, increment/decrement) {
            //body
        */

        // Q: print numbers from 1 to 5:

//        for (int num = 1; num <= 5; num++ ) {
//            System.out.println(num);

       // print numbers from 1 to n:
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            for (int num = 1; num <= n; num++) {
                System.out.println(num);

            }

        }
    }

