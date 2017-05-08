package SwordToOffer.MirrorTree;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {

    public void Mirror(TreeNode root) {

        if (root==null) return;
        TreeNode p=root.left;
        root.left=root.right;
        root.right=p;
        Mirror(root.left);
        Mirror(root.right);
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