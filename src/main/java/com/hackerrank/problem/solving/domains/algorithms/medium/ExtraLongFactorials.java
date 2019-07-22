package com.hackerrank.problem.solving.domains.algorithms.medium;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        if (n == 1) {
            System.out.println(1);
        } else {
            BigInteger factorial = BigInteger.ONE;
            for (long i = n; i >= 1; i--) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println(factorial);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(25);

//        scanner.close();
    }

}
