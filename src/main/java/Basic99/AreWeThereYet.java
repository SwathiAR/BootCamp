package Basic99;

import java.util.Scanner;

/**
 * Created by root on 12/6/15.
 */
public class AreWeThereYet {

    public static void main(String arg[]){
        areWeThereyet();
    }

    private static void areWeThereyet() {
        System.out.println("Are We There Yet?");
        Scanner sc = new Scanner(System.in);
        if(sc.nextLine().equalsIgnoreCase("yes")){
            System.out.println("Good!");
        }
        else areWeThereyet();
    }
}
