package SwordToOffer.PrintTreeCol;
import java.util.ArrayList;


/**
 * Created by apple on 2017/3/20.
 */
public class Solution {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        ArrayList<ArrayList<TreeNode>>  plists =new ArrayList<>();
        if (pRoot==null) return lists;
        ArrayList<TreeNode> plist=new ArrayList<>();
        plist.add(pRoot);
        plists.add(plist);
        for (int i=0;i<plists.size();i++){
            for (int j=0;j<plists.get(i).size();j++){
                if (plists.get(i).get(j).left!=null){
                    if (i>=plists.size()-1){
                        ArrayList<TreeNode> p=new ArrayList<>();
                        p.add(plists.get(i).get(j).left);
                        plists.add(p);
                    }
                    else {
                        plists.get(i+1).add(plists.get(i).get(j).left);
                    }
                }
                if (plists.get(i).get(j).right!=null){
                    if (i>=plists.size()-1){
                        ArrayList<TreeNode> p=new ArrayList<>();
                        p.add(plists.get(i).get(j).right);
                        plists.add(p);
                    }
                    else {
                        plists.get(i+1).add(plists.get(i).get(j).right);
                    }

                }
            }
        }

        for (int i=0;i<plists.size();i++){
            ArrayList<Integer> p=new ArrayList<>();
            lists.add(p);
            for (int j=0;j<plists.get(i).size();j++){
                p.add(plists.get(i).get(j).val);
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