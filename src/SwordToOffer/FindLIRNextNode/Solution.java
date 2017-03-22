package SwordToOffer.FindLIRNextNode;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by apple on 2017/3/19.
 */
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode==null) return null;
        if (pNode.right!=null){
            TreeLinkNode p=pNode,pre=pNode.right;
            while (pre.left!=null) {
                pre=pre.left;
            }
            return pre;

        }





        while (pNode.next!=null){
            if (pNode.next.left==pNode) {
                pNode=pNode.next;
                return pNode;
            }
            pNode=pNode.next;
        }
       if (pNode.next==null) return null;

        return pNode;
    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}