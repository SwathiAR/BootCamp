package Multithreading;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by root on 3/8/16.
 */
public class Consumer1 extends Thread {
    ArrayBlockingQueue<Integer> queue;

    Consumer1(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {


                    System.out.println("Consuming value");
            try {
                queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

            }


        }

