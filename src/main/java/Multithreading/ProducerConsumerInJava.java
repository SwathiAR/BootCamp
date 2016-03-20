package Multithreading;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 3/8/16.
 */
public class ProducerConsumerInJava {

    public  static  void  main(String[] args) {
        System.out.println("How to use wait and notify method in Java");
        System.out.println("Solving Producer Consumper Problem");

        int maxSize = 5;
        Queue<Integer> queue = new LinkedList<Integer>();
        Thread producer = new Producer(queue, maxSize);
        Thread consumer = new Consumer(queue, maxSize);

        producer.start();
        consumer.start();

    }

}
