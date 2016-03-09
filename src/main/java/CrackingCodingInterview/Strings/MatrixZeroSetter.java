package CrackingCodingInterview.Strings;

/**
 * Created by root on 12/16/15.
 *
 *
 * 1.7 Write an algorithm such that if an element in an MxN matrix is 0, its entire row and

 column is set to 0.



 At first glance, this problem seems easy: just iterate through the matrix and every time we

 see a 0, set that row and column to 0. There’s one problem with that solution though: we

 will “recognize” those 0s later on in our iteration and then set their row and column to zero.

 Pretty soon, our entire matrix is 0s!
 */
public class MatrixZeroSetter {

    public int[][] setToZero(int[][] matrix){

        int[] rows = new int[ matrix.length];
        int[] columns = new int[matrix[0].length];

        for(int i = 0 ; i< matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){

                if(matrix[i][j] == 0){
                    rows[i] = 1;
                    columns[j] = 1;
                }


            }
        }

        for(int i = 0 ; i< matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

               if(rows[i] == 1 || columns[j] == 1){
                   matrix[i][j] = 0;
               }


            }
        }




        return  matrix;
    }
}
