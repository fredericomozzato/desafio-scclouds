package com.fredericomozzato.fibonacci;

import com.fredericomozzato.util.Validator;

public class Fibonacci {

    private Fibonacci() {}

    public static int linearFibonacci(int n) {

        Validator.validate(n, 0);

        if (n == 0) {
            return n;
        }

        int[] seq = new int[n + 1];
        seq[1] = 1;

        for (int i = 2; i <= n; i++) {
            seq[i] = seq[i - 1] + seq[i - 2];
        }

        return seq[n];
    }


    public static int recursiveFibonacci(int n) {

        Validator.validate(n, 0);
        if (n == 0 || n == 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

}
