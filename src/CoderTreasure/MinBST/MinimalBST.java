package CoderTreasure.MinBST;

/**
 * Created by apple on 2017/3/24.
 */
public class MinimalBST {
    public int buildMinimalBST(int[] vals) {
        // write code here
        if (vals.length<2) return vals.length;
        int mid =(vals.length-1)/2;
        return BuilTree(vals,0,vals.length-1,mid,new TreeNode(vals[mid]));
    }
    public int BuilTree(int[] vals,int start,int end,int mid,TreeNode root){
        if (start==end) {
            root.left=new TreeNode(vals[start]);
            root.right=new TreeNode(vals[end]);
            return 1;
        }
        if (start>end) return 0;
        int midl=(start+mid-1)/2,midr=(mid+1+end)/2;
        root.left=new TreeNode(vals[midl]);
        root.right=new TreeNode(vals[midr]);
        int kl=BuilTree(vals,start,mid-1,midl,root.left);
        int kr=BuilTree(vals,mid+1,end,midr,root.right);
        return (kl>kr?kl:kr)+1;

    }

}
class TreeNode{
    TreeNode left=null;
    TreeNode right=null;
    int val;
    public TreeNode(int val){
        this.val=val;
    }
}

