package com.fyzan;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n);
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) { //
            int temp = b;
            b += a; // b = b + a
            a = temp;
            count++;

        }
        System.out.println(b + " is " + n + "th" + " fibonacci number!"); //i is the nth fibonacci number!




    }
}

