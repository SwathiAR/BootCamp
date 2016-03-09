package Basic99;

/**
 * Created by root on 12/7/15.
 */
public class PrintArray {

    public void printArray(String[] array){
        if(array==null|| array.equals(" ")){
            System.out.println(array);

        }


        for(int i = 0 ; i<array.length;i++){
            System.out.println(array[i]);

        }





    }
}
