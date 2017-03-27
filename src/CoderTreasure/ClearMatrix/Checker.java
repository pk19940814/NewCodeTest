package CoderTreasure.ClearMatrix;

/**
 * Created by apple on 2017/3/24.
 */
public class Checker {
    public boolean checkBST(TreeNode root) {
        // write code here
        if (root==null) return true;
        if (root.left!=null){
            if (root.val<=root.left.val) return false;
            if (root.left.right!=null)
            if (root.left.right.val>=root.val) return false;
        }
        if (root.right!=null) {
            if (root.val>=root.right.val) return false;
            if (root.right.left!=null) if (root.right.left.val<=root.val) return false;
        }


        return checkBST(root.left)&&checkBST(root.right);

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