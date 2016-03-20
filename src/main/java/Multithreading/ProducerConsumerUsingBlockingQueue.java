package Multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by root on 3/8/16.
 * http://javarevisited.blogspot.com/2012/07/countdownlatch-example-in-java.html
 */
public class ProducerConsumerUsingBlockingQueue {
    public static void main(String args[]) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(5);
     Thread produder = new Producer1(queue , 5);
        Thread consumer = new Consumer1(queue );
        produder.start();
        consumer.start();
    }


}
