package CrackingCodingInterview.DynamicProgramming;

import java.util.Arrays;

/**
 * Created by root on 3/19/16.
 */
public class MaxPathInPiramid {

    public int findMaxPath(int[][] piramid) {

        int[][] sumPiramid = new int[piramid.length][piramid[piramid.length - 1].length];
        int[][] path = new int[piramid.length][piramid[piramid.length - 1].length];
        for (int i = 0; i < piramid[piramid.length - 1].length; i++) {
            sumPiramid[piramid.length - 1][i] = piramid[piramid.length - 1][i];
        }
        for (int i = piramid.length - 2; i >= 0; i--) {
            for (int j = 0; j < piramid[i].length; j++) {
                int maxMath = Math.max(sumPiramid[i + 1][j], sumPiramid[i + 1][j + 1]);
                sumPiramid[i][j] = piramid[i][j] + maxMath;

                if (sumPiramid[i + 1][j] > sumPiramid[i + 1][j + 1]) {
                    path[i][j] = j ;
                } else {
                    path[i][j] = j+1;
                }


            }
        }

            int temp = 0;
            for(int n = 0 ; n<piramid.length-1 ; n++){
                System.out.print(piramid[n][temp] + "-->");
                temp = path[n][temp];
            }
        System.out.println(piramid[piramid.length-1][temp]);
        return sumPiramid[0][0];


    }
}

