package com.faizan;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter temp in Celsius: ");
        float celsius = input.nextFloat();

        float tempF = (celsius * 9/5) + 32;
        System.out.println(tempF);

    }
}
