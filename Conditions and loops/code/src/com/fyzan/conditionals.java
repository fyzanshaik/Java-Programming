package com.fyzan;

public class conditionals {
    public static void main(String[] args) {
        /*
            Syntax of If statements:
            if (boolean expression T or False) {
                //body
            } else {
                //do this
            }
         */

        int salary = 9000;
//
//        if (salary > 5000) {
//            salary += 2000;
//        } else {
//            salary = salary + 1000;
//        }
//        System.out.println(salary);

        // Multiple If-Else statements

        if (salary == 1000) {
            salary += 2000; //salary = salary + 2000;(same)
        } else if (salary > 8000) {
            salary += 4000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);


    }
}
