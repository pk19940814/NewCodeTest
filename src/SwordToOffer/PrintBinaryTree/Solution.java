package SwordToOffer.PrintBinaryTree;

import java.util.ArrayList;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<TreeNode> plist=new ArrayList<TreeNode>();

        if (root==null) return list;
        plist.add(root);
        for (int i=0;i<plist.size();i++){
            if (plist.get(i).left!=null) plist.add(plist.get(i).left);
            if (plist.get(i).right!=null) plist.add(plist.get(i).right);
            list.add(plist.get(i).val);
        }




        return list;

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
