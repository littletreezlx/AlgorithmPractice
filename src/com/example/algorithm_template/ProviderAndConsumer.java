package com.example.algorithm_template;

import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class ProviderAndConsumer {

    public ProviderAndConsumer(){
        //do
        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.execute(new Provider());
        pool.execute(new Consumer());
    }

    public static void main(String[] args) {
        new ProviderAndConsumer();
    }




    public class Restaurant{
        public Restaurant(){
            //do
            ExecutorService pool = Executors.newFixedThreadPool(2);

            pool.execute(new Provider());
            pool.execute(new Consumer());
        }
    }


    public  int food;
    public Object lock = new Object();
    public Queue queue = new LinkedBlockingDeque();

    class Provider implements Runnable{

        @Override
        public void run() {
            while (!Thread.interrupted()){
                synchronized (lock){
                    System.out.println("P");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    food ++;
                    System.out.println("做好了");
                    try {
                        lock.notifyAll();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    class Consumer implements Runnable{

        @Override
        public void run() {
            while (!Thread.interrupted()){
                synchronized (lock){
                    System.out.println("C");
                    if (food > 0){
                        food --;
                        System.out.println("吃掉了");
                    }
                    else {
                        try {
                            lock.notifyAll();
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }



}
