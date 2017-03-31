package CoderTreasure.FindClosedWords;

/**
 * Created by apple on 2017/3/27.
 */
public class Distance {
    public int getDistance(String[] article, int n, String x, String y) {
        // write code here
        if (x.equals(y)) return 0;
        int xpos=-1,ypos=-1,dist=n;
        for (int i=0;i<n;i++){
            if (article[i].equals(x)) {
                xpos=i;
                if (ypos!=-1){
                    int temp=xpos-ypos;
                    if (temp<0) temp=-temp;
                    if (temp<dist) dist=temp;
                }
            }
          else   if (article[i].equals(y)) {
                ypos=i;
                if (xpos!=-1){
                    int temp=xpos-ypos;
                    if (temp<0) temp=-temp;
                    if (temp<dist) dist=temp;
                }
            }

        }
       return dist;
    }
}