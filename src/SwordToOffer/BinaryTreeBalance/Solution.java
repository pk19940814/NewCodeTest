package SwordToOffer.BinaryTreeBalance;

/**
 * Created by apple on 2017/3/19.
 */
public class Solution {
    public static int TreeDepth(TreeNode root) {
        if (root==null) return 0;
        int l=TreeDepth(root.left);
        int r=TreeDepth(root.right);
        return l>r?l+1:r+1;
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root==null) return true;
        if (TreeDepth(root.left)-TreeDepth(root.right)>=-1&&TreeDepth(root.left)-TreeDepth(root.right)<=1){
            return true;
        }
        return false;
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
