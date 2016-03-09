package Basic99;

import java.util.Scanner;

/**
 * Created by root on 12/5/15.
 */
public class Basic {

    public static void main (String args[]) {
        printName();
        calculateAverage();


    }

    public static void printName(){

        System.out.println("Enter the name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " +  name);
    }

    public static void calculateAverage(){
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        double i = sc.nextInt();
        double i1 = sc.nextInt();
        double average = (i+i1)/2;
        System.out.println("Average is " + average);
    }
}
