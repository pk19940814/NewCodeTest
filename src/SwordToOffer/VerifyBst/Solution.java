package SwordToOffer.VerifyBst;

import java.util.ArrayList;

/**
 * Created by apple on 2017/3/20.
 */
public class Solution {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence==null||sequence.length==0) return false;
        return JudgeBST(sequence);





    }

    public boolean JudgeBST(int[] sequence){
        if (sequence==null||sequence.length<=2) return true;

        int num=sequence[sequence.length-1];
        int count=0;
        for (int i=0;i<sequence.length-1;i++){
            if (sequence[i]<num) count++;
        }
        for (int i=count;i<sequence.length-1;i++){
            if (sequence[i]<num) return false;
        }
        int minlen=count,maxlen=sequence.length-1-count;
        int []less=new  int[minlen];
        int []more =new int[maxlen];
        for (int i=0;i<minlen;i++){
            less[i]=sequence[i];
        }
        for (int i=0;i<maxlen;i++){
            more[i]=sequence[i+minlen+1];
        }

        return JudgeBST(less)&&JudgeBST(more);
    }



}
