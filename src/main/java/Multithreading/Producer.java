package Multithreading;

import java.util.Queue;
import java.util.Random;

/**
 * Created by root on 3/8/16.
 */
public class Producer extends  Thread {
    Queue<Integer> queue;
    int maxSize;

    Producer(Queue<Integer> queue , int maxSize){
        this.maxSize = maxSize;
        this.queue = queue;
    }

    public void run()  {
        while(true) {

            synchronized (queue) {
                if (queue.size() == maxSize) {
                    System.out.println("Queue is full");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                while (queue.size() != maxSize) {
                    Random random = new Random();
                    int integer = random.nextInt();
                    System.out.println("Producing value");
                    queue.add((integer));
                    queue.notify();
                }

            }

        }
    }

}
