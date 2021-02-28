package com.VB2020;

import com.VB2020.Resource.FizzBuzz;
import com.VB2020.Threads.A;
import com.VB2020.Threads.B;
import com.VB2020.Threads.C;
import com.VB2020.Threads.D;

import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {

        FizzBuzz resource = new FizzBuzz(15);

        CyclicBarrier barrier = resource.getBarrier();

        new C (resource, barrier);
        new A (resource, barrier);
        new B (resource, barrier);
        new D (resource, barrier);
    }
}
