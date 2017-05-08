package SwordToOffer.BinaryTreeJudge;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root2==null||root1==null) return false;


        if (root1.val==root2.val){
            if (root2.left==null&&root2.right!=null)
                return HasSubtree(root1.right,root2.right)||HasSubtree(root1.right,root2)||
                        HasSubtree(root1.left,root2.right);
            if (root2.right==null&&root2.left!=null)
                return HasSubtree(root1.left,root2.left)||HasSubtree(root1.left,root2)||
                        HasSubtree(root1.right,root2.left);
            if (root2.left==null&&root2.right==null) return true;
            return HasSubtree(root1.left,root2.left)&&HasSubtree(root1.right,root2.right)
                    ||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
        }
        else return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);



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