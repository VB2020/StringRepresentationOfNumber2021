package com.VB2020;

import com.VB2020.Resource.FizzBuzz;
import com.VB2020.Threads.A;
import com.VB2020.Threads.B;
import com.VB2020.Threads.C;
import com.VB2020.Threads.D;

import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {
        FizzBuzz resource = new FizzBuzz(99);
        CyclicBarrier barrier = new CyclicBarrier(4);

        new A (resource, barrier);
        new B (resource, barrier);
        new C (resource, barrier);
        new D (resource, barrier);
    }
}
