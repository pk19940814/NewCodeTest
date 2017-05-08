package SwordToOffer.CountRobotMovement;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by apple on 2017/3/21.
 */
public class Solution {

    public int movingCount(int threshold, int rows, int cols)
    {
        matrix=new int[rows][cols];
        mcount=0;
        //System.out.println("movingcount");
        Judge(threshold,rows,cols,0,0);

       return  mcount;
    }

    public void Judge(int threshold,int rows,int cols,int y,int x){
        if (x>=cols||y>=rows||x<0||y<0||Sum(x)+Sum(y)>threshold||matrix[y][x]==1){
            return;
        }


                mcount++;
        matrix[y][x]=1;

        Judge(threshold,rows,cols,y+1,x);

        Judge(threshold,rows,cols,y,x+1);
        Judge(threshold,rows,cols,y-1,x);

       Judge(threshold,rows,cols,y,x-1);

    }

    public int Sum(int n){
        int sum=0;
        while (n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    private  int[] [] matrix;
    private int mcount;

}





