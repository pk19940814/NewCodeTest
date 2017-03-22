package SwordToOffer.PrintZhiTree;
import java.util.ArrayList;

/**
 * Created by apple on 2017/3/21.
 */
public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
        if (pRoot==null) return lists;
        ArrayList<ArrayList<TreeNode>> plists=new ArrayList<ArrayList<TreeNode>>();
        plists.add(new ArrayList<TreeNode>());
        TreeNode p=pRoot;
        plists.get(0).add(p);
        for (int i=0;i<plists.size();i++){

            for ( int j=0;j<plists.get(i).size();j++){
                if (i>=plists.size()-1){
                    plists.add(new ArrayList<TreeNode>());
                }
                if (plists.get(i).get(j).left!=null)
                    plists.get(i+1).add(plists.get(i).get(j).left);
                if (plists.get(i).get(j).right!=null)
                    plists.get(i+1).add(plists.get(i).get(j).right);

            }
        }
        for (int i=0;i<plists.size();i++){
            if (plists.get(i).size()==0) break;
            lists.add(new ArrayList<Integer>());
            if (i%2==0){
                for (int j=0;j<plists.get(i).size();j++){
                    lists.get(i).add(plists.get(i).get(j).val);
                }

            }
            else {
                for (int j=plists.get(i).size()-1;j>=0;j--){
                    lists.get(i).add(plists.get(i).get(j).val);
                }
            }
        }
        return lists;
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