package com.VB2020.Threads;

import com.VB2020.Resource.FizzBuzz;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class D implements Runnable
{
    FizzBuzz resource;
    CyclicBarrier barrier;

    public D (FizzBuzz resource, CyclicBarrier barrier)
    {
        this.resource = resource;
        this.barrier = barrier;
        new Thread(this).start();
    }

    @Override
    public void run()
    {
        for(int i = 1; i <= resource.getN(); i++) {
            if ((i % 3 != 0) && (i % 5 != 0)) {
                resource.printN(i);
            }

            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
