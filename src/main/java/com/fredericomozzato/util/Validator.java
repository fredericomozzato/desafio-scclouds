package com.fredericomozzato.util;

public class Validator {

    private Validator() {}

    public static void validate(int input, int limit) {
        if (input < limit) {
            throw new IllegalArgumentException();
        }
    }
}
