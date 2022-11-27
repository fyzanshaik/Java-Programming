package com.fyzan;

import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int answer = 0;

        while (num > 0) {
            int remainder = num % 10;
            num = num / 10; // num /= 10;

            answer = answer * 10 + remainder;
        }


        System.out.println(answer);
    }
}
