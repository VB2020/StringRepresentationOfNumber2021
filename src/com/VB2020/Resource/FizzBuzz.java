package com.VB2020.Resource;

import java.util.concurrent.CyclicBarrier;

public class FizzBuzz {

    private int N;

    private CyclicBarrier barrier = new CyclicBarrier(4);

    public CyclicBarrier getBarrier() {
        return barrier;
    }

    public FizzBuzz(int n) {
        this.N = n;
    }

    public int getN() {
        return N;
    }

    public void printFizz()
    {
        System.out.print("fizz, ");
    }

    public void printBuzz()
    {
        System.out.print("buzz, ");
    }

    public void printFizzBuzz()
    {
        System.out.print("fizzbuzz, ");
    }

    public void printN(int n)
    {
        System.out.print(n + ", ");
    }
}
