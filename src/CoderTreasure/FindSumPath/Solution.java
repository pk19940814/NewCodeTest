package CoderTreasure.FindSumPath;
import java.util.ArrayList;


/**
 * Created by apple on 2017/3/24.
 */
public class Solution {
    public Solution(){
        lists=new ArrayList<ArrayList<Integer>>();
    }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        ArrayList<Integer> list=new ArrayList<Integer>();
        if (root==null||target<0) return lists;
        Find(root,target,list);

        return lists;
    }
    public void Find(TreeNode root,int target,ArrayList<Integer> list){
        if (root==null||root.val>target) return;
        ArrayList <Integer> listtemp=new ArrayList<Integer>();
        for (int a:list
                ) {
            listtemp.add(a);
        }
        if (target==root.val&&root.left==null&&root.right==null) {
            listtemp.add(root.val);
            lists.add(listtemp);
        }else {
            listtemp.add(root.val);
            Find(root.left,target-root.val,listtemp);
            Find(root.right,target-root.val,listtemp);
        }

    }

    private ArrayList<ArrayList<Integer>> lists;

}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}