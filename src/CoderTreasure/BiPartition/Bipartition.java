package CoderTreasure.BiPartition;

/**
 * Created by apple on 2017/3/25.
 */
public class Bipartition {
    public double[] getBipartition(Point[] A, Point[] B) {
        // write code here
        double[] a=new double[2];
        double acx=(A[0].x+A[2].x)/2.0;
        double acy=(A[0].y+A[2].y)/2.0;

        double bcx=(B[0].x+B[2].x)/2.0;
        double bcy=(B[0].y+B[2].y)/2.0;

        a[0]=(acy-bcy)/(acx-bcx);
        a[1]=acy-a[0]*acx;



        return a;

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