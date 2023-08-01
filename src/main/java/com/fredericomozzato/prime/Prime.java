package com.fredericomozzato.prime;

import com.fredericomozzato.util.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Prime {

    private Prime() {}

    public static List<Integer> linearPrime(int n) {
        Validator.validate(n, 1);

        return IntStream.rangeClosed(2, n)
                .filter(Prime::isPrime)
                .boxed()
                .toList();
    }


    public static List<Integer> recursivePrime(int n) {
        Validator.validate(n, 1);
        List<Integer> primes = new ArrayList<>();

        getPrimesRecursively(n, primes);
        return primes;
    }


    private static void getPrimesRecursively(int n, List<Integer> primes) {
        if (n == 1) { return; }

        if (isPrime(n)) {
            primes.add(0, n);
        }

        getPrimesRecursively(--n, primes);
    }


    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
