package CoderTreasure.ConvertTreeToList;

/**
 * Created by apple on 2017/4/3.
 */
public class Converter {
    public Converter() {
        listNode=new ListNode(-1);
        p=listNode;
    }

    public ListNode treeToList(TreeNode root){


        if (root==null) return null;
        treeToList(root.left);
        p.next=new ListNode(root.val);
        p=p.next;


        treeToList(root.right);

        return listNode.next;
    }
    ListNode listNode;
    ListNode p;

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