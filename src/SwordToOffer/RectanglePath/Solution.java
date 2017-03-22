package SwordToOffer.RectanglePath;

/**
 * Created by apple on 2017/3/22.
 */
public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if ((rows)*(cols)!=matrix.length) return false;
        if (str.length==0) return false;
        flag=new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.println(i+","+j);
                if (Judge(matrix,rows,cols,i,j,str,0))
                    return true;

            }
        }


        return false;
    }
    private boolean Judge(char[] matrix, int rows,int cols,int i,int j,char[] str,int pos){
        if (i<0||j<0||i>=rows||j>=cols){

            return false;
        }
        if (flag[i][j]==1||pos>=str.length||str[pos]!=matrix[i*cols+j]){

            return false;
        }
        boolean t;


        flag[i][j]=1;
        System.out.println(str[pos]);
        if (pos==str.length-1) return true;

        if (Judge(matrix,rows,cols,i+1,j,str,pos+1)||Judge(matrix,rows,cols,i-1,j,str,pos+1)
                ||Judge(matrix,rows,cols,i,j+1,str,pos+1)||Judge(matrix,rows,cols,i,j-1,str,pos+1))
        {
            t=true;
        }
        else {
            flag[i][j] = 0;

            t = false;
        }
        return t;


    }

    private int [][]flag;
}
