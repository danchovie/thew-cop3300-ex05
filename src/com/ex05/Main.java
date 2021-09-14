/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input_val = new Scanner(System.in);
        String i1, i2;
        int val1, val2, sum, diff, prod, quot;
        System.out.print("What is the first number? ");
        i1 = input_val.nextLine();
        System.out.print("What is the second number? ");
        i2 = input_val.nextLine();
        val1 = Integer.parseInt(i1);
        val2 = Integer.parseInt(i2);
        sum = val1 + val2;
        diff = val1 - val2;
        prod = val1 * val2;
        quot = val1 / val2;
        System.out.printf("%s + %s = %d\n%s - %s = %d\n%s * %s = %d\n%s / %s = %d", i1, i2, sum, i1, i2, diff, i1, i2, prod, i1, i2, quot);
    }
}
