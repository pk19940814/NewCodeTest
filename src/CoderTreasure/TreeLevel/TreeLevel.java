package CoderTreasure.TreeLevel;

import java.util.ArrayList;


/**
 * Created by apple on 2017/3/24.
 */
public class TreeLevel {
    public ListNode getTreeLevel(TreeNode root, int dep) {
        // write code here
        if (root==null) return null;
        ArrayList<ArrayList<TreeNode>> lists=new ArrayList<ArrayList<TreeNode>>();
        for (int i=0;i<dep;i++) lists.add(new ArrayList<TreeNode>());
        lists.get(0).add(root);
        for (int i=0;i<dep-1;i++){
            for (int j=0;j<lists.get(i).size();j++){
                TreeNode p=lists.get(i).get(j);

                    if (p.left!=null)
                        lists.get(i+1).add(p.left);
                    if (p.right!=null)
                        lists.get(i+1).add(p.right);

            }
        }
        ListNode head=new ListNode(-1),pr=head;
        for (TreeNode p:lists.get(dep-1)
             ) {
            pr.next=new ListNode(p.val);

            pr=pr.next;
        }
        pr=head.next;
        head.next=null;
        return pr;


    }

}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
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