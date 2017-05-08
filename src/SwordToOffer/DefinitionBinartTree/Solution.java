package SwordToOffer.DefinitionBinartTree;

/**
 * Created by apple on 2017/3/16.
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre,int[] in){

        if (pre.length<=0||in.length<=0||pre.length!=in.length||pre==null||in==null) return null;
        TreeNode treeNode=new TreeNode(pre[0]);
        int setoff=0;

        for (;setoff<in.length;setoff++){
            if(in[setoff]==pre[0])  break;
        }
        int[] lpre;
        int [] rin;
        int[] lin;
        int[] rpre;

        if(setoff>0){
        lpre=new int[setoff];

        lin=new int[setoff];
            for(int i=0;i<setoff;i++){
                lpre[i]=pre[i+1];
                lin[i]=in[i];
            }
            treeNode.left=reConstructBinaryTree(lpre,lin);
        }else{
            treeNode.left=null;
        }
        if (pre.length-setoff-1>0) {

            rin = new int[pre.length - setoff - 1];

            rpre = new int[pre.length - setoff - 1];
            for(int i=setoff+1;i<pre.length;i++){
                rpre[i-setoff-1]=pre[i];
                rin[i-setoff-1]=in[i];
            }
            treeNode.right=reConstructBinaryTree(rpre,rin);
        }else {
            treeNode.right=null;
        }
        return treeNode;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}