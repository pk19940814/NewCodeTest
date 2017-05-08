package SwordToOffer.CheckMate;

/**
 * Created by apple on 2017/3/26.
 */
public class Board {
    public boolean checkWon(int[][] board) {
        // write code here
        int[][] line={{0,1,2},{0,3,6},{0,4,8},{1,4,7},{2,5,8},{3,4,5},{6,7,8},{2,4,6}};
        for (int i=0;i<8;i++){

            int x1=line[i][0]/3,y1=line[i][0]%3,x2=line[i][1]/3,y2=line[i][1]%3,x3=line[i][2]/3,y3=line[i][2]%3;
            int flag=board[x1][y1]+board[x2][y2]+board[x3][y3];
            if (flag==-3) {
                return false;
            }
            if (flag==3) return true;
        }
        return false;
    }
}
