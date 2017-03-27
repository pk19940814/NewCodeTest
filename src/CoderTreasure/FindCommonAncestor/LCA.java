package CoderTreasure.FindCommonAncestor;

/**
 * Created by apple on 2017/3/24.
 */
public class LCA {
    public int getLCA(int a,int b){
        if (a==b ) return a;
        if (a>b) return getLCA(a/2,b);
        return getLCA(a,b/2);




    }


}
