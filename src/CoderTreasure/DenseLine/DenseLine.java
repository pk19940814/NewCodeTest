package CoderTreasure.DenseLine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by apple on 2017/3/25.
 */
public class DenseLine {
    public double[] getLine(Point[] p, int n) {
        // write code here
        Set<ArrayList<Double>> set=new HashSet<ArrayList<Double>>();

        double[] result=new double[2];


        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i!=j) {
                    double k=(p[i].y-p[j].y)*1.0/(p[i].x-p[j].x);
                    double b=p[i].y-k*p[i].x;
                    ArrayList<Double> list=new ArrayList<Double>();
                    list.add(k);
                    list.add(b);
                    set.add(list);
                }
            }
        }

        ArrayList<Double> templist=new ArrayList<Double>();
        int count=0;
        for (ArrayList<Double> listtemp:set
             ) {
            int tempcount=0;
            for (Point point:p
                 ) {
                if (Judge(point,listtemp) ) tempcount++;


            }
            if (tempcount>count){
                count=tempcount;
                templist=listtemp;
            }

        }

        result[0]=templist.get(0);
        result[1]=templist.get(1);

        return result;

    }

    public boolean Judge(Point point,ArrayList<Double> list){
        if (list.get(1)==point.y-point.x*list.get(0)) return true;
        return false;

    }
}
class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this.x = 0;
        this.y = 0;
    }
}