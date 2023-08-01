package com.fredericomozzato.fibonacci;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    /**
     * índices e valores dos 10 primeiros números da sequência de Fibonacci
     */
    private static Stream<Arguments> fibonacciParameters() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(4, 3),
                Arguments.of(5, 5),
                Arguments.of(6, 8),
                Arguments.of(7, 13),
                Arguments.of(8, 21),
                Arguments.of(9, 34),
                Arguments.of(10, 55)
        );
    }

    @ParameterizedTest
    @MethodSource("fibonacciParameters")
    void linearFibonacciTest(int index, int expected) {
        int result = Fibonacci.linearFibonacci(index);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("fibonacciParameters")
    void recursiveFibonacciTest(int index, int expected) {
        int result = Fibonacci.recursiveFibonacci(index);
        assertEquals(expected, result);
    }
}