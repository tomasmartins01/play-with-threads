package com.mindera.school;

public class FibonacciThread extends Thread {
    private String result;
    private int n;

    public FibonacciThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
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
        result = sequencia;
    }

    public String getResult() {
        return result;
    }
}
