package com.fyzan;

import java.util.Scanner;

public class countnums {
    public static void main(String[] args) {
        int num = 22789; // Given Number

        int count = 0; //Number of recurring digits to find
        while (num > 0) {
            int remainder = num % 10;
            if (remainder == 2) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
