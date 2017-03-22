package SwordToOffer.SerializeTreeAndDeserialize;

import java.util.ArrayList;

/**
 * Created by apple on 2017/3/21.
 */
public class Solution {
    String Serialize(TreeNode root) {
        String str="";
        if (root==null) {
            str+="#,";
            return str;

        }

        str=root.val+","+Serialize(root.left)+Serialize(root.right);

        return str;
    }


    TreeNode Deserialize(String str) {
        index++;

      String []strs=str.split(",");
      if (index>=strs.length) return null;
      TreeNode p=null;
      if (!strs[index].equals("#")){
          p=new TreeNode(Integer.valueOf(strs[index]));
          p.left=Deserialize(str);
          p.right=Deserialize(str);
      }
      return p;


    }
    public int index=-1;
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
