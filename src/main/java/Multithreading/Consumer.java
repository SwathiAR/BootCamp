package Multithreading;

import java.util.Queue;
import java.util.Random;

/**
 * Created by root on 3/8/16.
 */
public class Consumer extends  Thread {
    Queue<Integer> queue;
    int maxSize;

    Consumer(Queue<Integer> queue, int maxSize) {
        this.maxSize = maxSize;
        this.queue = queue;
    }

    public void run() {
        while (true) {
            synchronized (queue) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty, waiting it to be filled");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                while (!queue.isEmpty()) {
                    System.out.println("Consuming value");
                    queue.poll();
                    queue.notify();
                }

            }


        }
    }
}
