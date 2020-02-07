package com.mindera.school;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FibonacciCalculator {

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
    public List<String> sequences(List<Integer> entries) throws InterruptedException {
        List<FibonacciThread> threads = new LinkedList<>();

        for (int i = 0; i < entries.size(); i++) {
            threads.add(new FibonacciThread(entries.get(i)));
            threads.get(i).start();
        }

        List<String> results = new LinkedList<>();
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).join();
            results.add(threads.get(i).getResult());
        }

        return results;
    }
}
