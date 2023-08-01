package com.fredericomozzato.prime;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    private static Stream<Arguments> primeParameters() {
        return Stream.of(
                Arguments.of(2, List.of(2)),
                Arguments.of(3, List.of(2, 3)),
                Arguments.of(10, List.of(2, 3, 5, 7))
        );
    }


    @ParameterizedTest
    @MethodSource("primeParameters")
    void linearPrimeTest(int n, List<Integer> expected) {
        List<Integer> result = Prime.linearPrime(n);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("primeParameters")
    void recursivePrimeTest(int n, List<Integer> expected) {
        List<Integer> result = Prime.recursivePrime(n);
        assertEquals(expected, result);
    }

    @Test
    void badInputLinearPrimeExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> Prime.linearPrime(-1));
        assertThrows(IllegalArgumentException.class, () -> Prime.linearPrime(0));
    }

    @Test
    void badInputRecursivePrimeExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> Prime.recursivePrime(-1));
        assertThrows(IllegalArgumentException.class, () -> Prime.recursivePrime(0));
    }

}