package SwordToOffer.MirrorBinaryTree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by apple on 2017/3/19.
 */
public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        Stack <TreeNode> stack=new Stack<TreeNode>();
        if (pRoot==null) return true;

        ArrayList<TreeNode> list=new ArrayList<TreeNode>();
        TreeNode p=pRoot;
        while (p!=null||!stack.isEmpty()){
            while (p!=null){
                stack.push(p);
                p=p.left;
            }
            p=stack.pop();
            list.add(p);
            p=p.right;
        }


        for (int i=0,j=list.size()-1;i<=j;i++,j--){
            if (list.get(i).left==null||list.get(j).right==null)
                if (list.get(i).left!=list.get(j).right) return false;
            if (list.get(i).right==null||list.get(j).left==null)
                if (list.get(j).left!=list.get(i).right) return false;



            if (list.get(i).val!=list.get(j).val) return false;
            if (list.get(i).left!=null&&list.get(j).right!=null)
                if (list.get(i).left.val!=list.get(j).right.val) return false;
            if (list.get(j).left!=null&&list.get(i).right!=null)
                if (list.get(j).left.val!=list.get(i).right.val) return false;


        }


        return true;
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