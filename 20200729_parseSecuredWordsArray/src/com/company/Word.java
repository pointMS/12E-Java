package com.company;

public class Word {
    private int sum;

    public Word(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Word{" +
                "sum=" + sum +
                '}';
    }
}
