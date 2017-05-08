package CoderTreasure.FinNextInLDR;

import java.util.ArrayList;

/**
 * Created by apple on 2017/3/24.
 */
public class Path {
    public int findSucc(TreeNode root, int p) {
        // write code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        LDRSort(list,root,p,false);
        return list.get(list.indexOf(p)+1);

    }
    public void LDRSort(ArrayList<Integer> list,TreeNode treeNode,int n,boolean flag){
        if (treeNode==null) return;



        LDRSort(list,treeNode.left,n,flag);
        list.add(treeNode.val);
        if (flag) return;
        if (treeNode.val==n) flag=true;
        LDRSort(list,treeNode.right,n,flag);

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
