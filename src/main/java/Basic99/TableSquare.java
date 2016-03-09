package Basic99;

/**
 * Created by root on 12/6/15.
 *
 *

 Write a method that prints out a 4 x 4 table square
 2.9.1 Example

 1:  tableSquare()
 2:   *** Output ***
 3:  A 4 x 4 table square
 5:  | 1 | 2 |  3 |  4 |
 6:  | 2 | 4 |  6 |  8 |
 7:  | 3 | 6 |  9 | 12 |
 8:  | 4 | 8 | 12 | 16 |


 */
public class TableSquare {

    public void printTableSquare(int n) {
        if (n < 1) {
            System.out.println(" ");

        } else {

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("|" + i * j + "\t");
                }
                System.out.println("|");

            }
        }


    }
}
