package CrackingCodingInterview;

/**
 * Created by root on 12/15/15.

 Given an image represented by an NxN matrix, where each pixel in the image is 4

 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

 */
public class RotateImage {

    public int[][] rotate(int[][] array){

        for(int i = 0 ; i<array.length ; i++){
            for(int j = i ; j<array.length ; j++){
                int temp =array[i][j];
                 array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        return array;

    }

    public int[][] rotate1(int[][] array){
        int length = array.length;
        for (int i=0 ;i<length/2 ;i++){
            for(int j = i ; j<length-i-1;j++){

                //top left to top right'
                int temp = array[j][(length-1-i)];
                array[j][(length-1-i)] = array[i][j];
                array[i][j] = temp;

                //top right to bottom right
                temp = array[(length-1-i)][(length-1-j)];
                array[(length-1-i)][(length-1-j)] = array[i][j];
                array[i][j] = temp;

                //bottom right to bottom left and bottom left to top right
                temp = array[(length-1-j)][i];
                array[(length-1-j)][i] = array[i][j];
                array[i][j] = temp;







            }
        }




   return  array;
    }

}
