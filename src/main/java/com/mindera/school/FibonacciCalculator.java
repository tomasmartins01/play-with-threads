package com.mindera.school;

import java.util.List;

/**
 * Used to calculate the Fibonacci sequence
 *
 * https://en.wikipedia.org/wiki/Fibonacci_number
 */
public class FibonacciCalculator {

    /**
     * Calculates n entries of the fibonacci sequence
     * <p>
     * In mathematics, the Fibonacci numbers, commonly denoted Fn, form a sequence, called the Fibonacci sequence,
     * such that each number is the sum of the two preceding ones, starting from 0 and 1
     * <p>
     * eg: 0,1,1,2,3,5,8,13,21,34,55,89,144
     */
    public String fibonacciSequence(final int n) {
        int n1 = 0;
        int n2 = 1;
        int soma;
        String sequencia = n1 + "," + n2;

        int i = 0;
        while (i < n - 2) {
            soma = n1 + n2;
            n1 = n2;
            n2 = soma;
            i++;
            sequencia += "," + soma;
        }
        return sequencia;
    }

    /**
     * Calculates n entries of the fibonacci sequence for each entry in the list
     */
    public List<String> sequences(List<Integer> entries) {
        // TODO you should use threads for this
        return List.of("");
    }
}
