package LeetCode.MinumDepth;

import java.util.ArrayList;

/**
 * Created by apple on 2017/4/17.
 */
public class Solution {
    public int run(TreeNode root) {
        if (root==null) return 0;
        ArrayList<ArrayList<TreeNode>> lists=new ArrayList<ArrayList<TreeNode>>();
        ArrayList<TreeNode> list=new ArrayList<TreeNode>();
        list.add(root);
        lists.add(list);


        for (int i=0;i<lists.size();i++){
            for (int j=0;j<lists.get(i).size();j++){
                if (lists.get(i).get(j).left==null&&lists.get(i).get(j).right==null) return i+1;
                if (i==lists.size()-1) {
                    ArrayList<TreeNode> temp=new ArrayList<TreeNode>();
                    lists.add(temp);

                }
                if (lists.get(i).get(j).left!=null)
                lists.get(i+1).add(lists.get(i).get(j).left);
                if (lists.get(i).get(j).right!=null)
                lists.get(i+1).add(lists.get(i).get(j).right);

            }
        }

        return lists.size();
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}