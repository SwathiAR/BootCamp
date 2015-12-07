package Basic99;

/**
 * Created by root on 12/6/15.



 Write a method that uses nested loops to produce the following pattern

 1:  triangle()
 2:   *** Output ***
 3:  *
 4:  **
 5:  ***
 6:  ****
 7:  *****


 */
public class PatternPrinter {

public void printPattern(int n){
    for(int i = 1 ; i<=n ; i++){
        for(int j = i ; j>0;j--){
            System.out.print("*");
        }
        System.out.println("");
    }


}

}
