package LeetCode.MaxPoints;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * Created by apple on 2017/4/17.
 */
public class Solution {

    public int maxPoints(Point[] points) {
        int max=0;
        if (points.length==1) return 1;
        for (int i = 0; i < points.length - 1; i++) {
            int count=1;
            int uniq=0;
            int samy=0;
            double keyk=0;
            TreeMap<Double,Integer> map=new TreeMap<Double,Integer>();
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].equals(points[j])) count++;
                else {
                    if (points[i].x==points[j].x){
                        uniq++;
                    }
                    else if (points[i].y==points[j].y){
                        samy++;
                    }
                    else {
                        double k=(double)(points[i].y-points[j].y)/(points[i].x-points[j].x);

                        if (map.containsKey(k)){
                            map.put(k,map.get(k)+1);
                        }
                        else map.put(k,1);
                    }
                }
            }
            int k1=uniq+count;
            int k2=samy+count;
            int k3=0;

                 Iterator<Entry<Double,Integer>> iterator=map.entrySet().iterator();

                while (iterator.hasNext()){
                    Entry<Double,Integer> entry=iterator.next();
                    int tt=entry.getValue();
                    if (k3<tt+count){
                        k3=tt+count;

                        keyk=entry.getKey();
                    }
                }

            if (k1<k2) k1=k2;
            if (k1<k3) k1=k3;
            if (max<k1) max=k1;

        }
        return max;

    }
}
class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }


    Point(int a, int b) {
        x = a;
        y = b;
    }
    public boolean equals(Point p){
        if (p.x==x&&p.y==y) return true;
        return false;
    }
}
