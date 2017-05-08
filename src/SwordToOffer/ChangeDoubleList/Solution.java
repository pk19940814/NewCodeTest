package SwordToOffer.ChangeDoubleList;

/**
 * Created by apple on 2017/3/20.
 */

public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        Transfrom(pRootOfTree);

        return head;
    }
    private void Transfrom(TreeNode p){
        if (p==null) return;

        Transfrom(p.left);
        if (head==null) head=p;
        if (temp==null) temp=p;
        else {
            temp.right=p;
            p.left=temp;
            temp=p;
        }
        Transfrom(p.right);
        }





    private TreeNode temp=null;
    private TreeNode head=null;

}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}