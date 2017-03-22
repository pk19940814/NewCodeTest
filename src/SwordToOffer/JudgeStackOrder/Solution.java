package SwordToOffer.JudgeStackOrder;

/**
 * Created by apple on 2017/3/17.
 */

    public class Solution {
        public boolean IsPopOrder(int [] pushA,int [] popA) {
            for (int si:pushA
                 ) {
                int i=0;
                for (;i<popA.length;i++) {
                    if (si==popA[i]) break;
                }
                if (i==popA.length) return false;

            }
            if (pushA.length<3) return true;
            boolean flag=true;
            if (pushA.length==3){
                if (pushA[0]==popA[1]&&pushA[1]==popA[2]&&pushA[2]==popA[0]) return false;
                else return true;
            }

            for(int i=0;i<pushA.length-2;i++){
                int a=pushA[i],b=pushA[i+1],c=pushA[i+2];
                int[] ps=new int[]{a,b,c};
                int[] pp=new int[3];
                int j=0;
                for (int temp:popA
                     ) {
                    if (temp==a||temp==b||temp==c) {
                        pp[i]=temp;
                        i++;
                        if(i==3) break;;
                    }
                }
                if (!IsPopOrder(ps,pp)){
                    flag= false;
                }



            }
            return flag;
        }
    }

