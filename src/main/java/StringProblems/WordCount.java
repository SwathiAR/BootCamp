package StringProblems;

/**
 * Created by swathi on 11/23/2015.
 */
public class WordCount {

    public int countWordsUsingSplit(String str){
        if(str==null ){return 0;}

        String[] split = str.split(" ");
        return split.length;


    }

    public int countWordsWithoutSplit(String str){
        if(str==null ){return 0;}
        int count = 0;

        if(str.charAt(0) != ' '){
            count = 1;
        }

        for(int i=1 ; i<str.length()-1 ; i++){

            if(str.charAt(i)==' ' && str.charAt(i+1) != ' '){
                count++;

            }
        }

        return count;

    }
}
