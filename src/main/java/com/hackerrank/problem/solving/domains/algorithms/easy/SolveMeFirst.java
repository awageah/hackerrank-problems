package com.hackerrank.problem.solving.domains.algorithms.easy;

import java.util.Scanner;

public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
        // return summation
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }

}
