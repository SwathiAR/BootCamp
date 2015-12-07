/*
random() in Math prints double value between 0.0 to 1.0
nextInt(int i) in Random prints number including 0 to i exclusive
 */


package Basic99;

import java.util.Random;

/**
 * Created by root on 12/5/15.
 */
public class Loop {

    public static void main(String arg[]){

        print1To10WithFor();
        print1To10WithWhile();
        print1To10WithdoWhile();
        print1OddLessThan20();
        print2OddLessThan20();
        printSquaresTill100();
        print4RandomBtwn1To10();
        print4RandmBetwn1To10();


    }

    private static void print4RandomBtwn1To10() {
        for(int i = 0 ; i<4 ;i++){
            if(Math.random() != 0.0){
                System.out.println((int)(Math.random() * 10));
            }
        }

    }

    private static void print4RandmBetwn1To10(){
        Random r = new Random();
        for(int i = 0 ; i<4 ; i++){
            System.out.println( r.nextInt(9) +1);
        }
    }

    private static void printSquaresTill100() {
        for(int i=1; i*i <=100 ; i++){
            System.out.println(i*i);
        }
    }

    private static void print2OddLessThan20() {
        for(int i = 1 ; i<20 ; i =i+2){
            System.out.println(i);
        }
    }

    private static void print1OddLessThan20() {
        for(int i=1 ; i<20 ; i++){
            if(i/2!=0){
                System.out.println(i);
            }
        }
    }

    private static void print1To10WithdoWhile() {
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<11);
    }

    public static void print1To10WithFor(){
        for(int i =1 ; i<11 ;i++){
            System.out.println(i);
        }

    }

    private static void print1To10WithWhile(){
        int i =1;
        while(i<11){
            System.out.println(i);
            i++;
        }
    }
}
