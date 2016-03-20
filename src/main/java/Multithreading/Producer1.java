package Multithreading;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by root on 3/8/16.
 */
public class Producer1 extends  Thread {

    ArrayBlockingQueue<Integer> queue;
    int maxSize;

    Producer1(ArrayBlockingQueue<Integer> queue , int maxSize){
        this.maxSize = maxSize;
        this.queue = queue;
    }

    public void run()  {
        while(true) {



                    Random random = new Random();
                    int integer = random.nextInt();
                    System.out.println("Producing value");
            try {
                queue.put((integer));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

            }

        }



