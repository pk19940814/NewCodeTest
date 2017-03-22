package SwordToOffer.MartixClockWise;

import java.util.ArrayList;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        if (matrix==null||matrix.length==0) return list;
        int rolen=matrix.length;
        int colen=matrix[0].length;

        int count=1,max=rolen*colen;
        int i=0,j=0,circle=0;
        list.add(matrix[i][j]);
        boolean up=false,right=true,left=false,down=false;
        while (count<max) {
            if (right) {

                if (j < colen - circle - 1) {
                    j++;

                } else {
                    i++;
                    right = false;
                    down = true;
                }

            } else if (down) {

                if (i < rolen - circle - 1) {
                    i++;

                } else {
                    j--;
                    down = false;
                    left = true;
                }

            } else if (left) {

                if (j > circle) {
                    j--;
                } else {
                    i--;

                    left = false;
                    up = true;
                }


            } else if (up) {

                if (i > circle + 1) {
                    i--;
                } else {

                    up = false;
                    right = true;
                    circle++;
                    i = circle;
                    j = circle;
                }

            }
            if (i < rolen && i >= 0 && j < colen && j >= 0) {
                list.add(matrix[i][j]);
                count++;
            }

        }


        return list;




    }
}
