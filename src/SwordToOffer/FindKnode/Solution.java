package SwordToOffer.FindKnode;

import java.util.Stack;

/**
 * Created by apple on 2017/3/20.
 */
public class Solution {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (pRoot==null) return null;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        TreeNode p=pRoot;
        int count=0;
        while (p!=null||!stack.isEmpty()){
            while (p!=null){
                stack.push(p);
                p=p.left;
            }
            p=stack.pop();
            count++;
            if (count==k) return p;
            p=p.right;
        }
        return null;
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