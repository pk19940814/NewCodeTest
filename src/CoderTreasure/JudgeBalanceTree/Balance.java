package CoderTreasure.JudgeBalanceTree;

/**
 * Created by apple on 2017/3/24.
 */
public class Balance {
    public boolean isBalance(TreeNode root) {
        // write code here
        if (root==null) return true;
        int k=Height(root.left)-Height(root.right);
        if (k>1||k<-1) return false;
        else return isBalance(root.left)&&isBalance(root.right);

    }
    public int Height(TreeNode node){
        if (node==null) return 0;
        return  (Height(node.left)>Height(node.right)?Height(node.left):Height(node.right))+1;
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}