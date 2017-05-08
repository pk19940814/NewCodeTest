package CoderTreasure.Count2;

/**
 * Created by apple on 2017/4/3.
 */
public class Count2 {
    public int countNumberOf2s(int n) {
        // write code here

        int count=0;
        if (n<2) return count;
        int i=1;
        while (true){
            int temp=n-2*i;//we count from here

            if (temp<0) break;
            int t;
            if (temp%(10*i)>=i) {
                t=i;
            }
            else  t=temp%(10*i)%i+1;
            count+=temp/(10*i)*i+t  ;

            i*=10;


        }
    return count;
    }
}