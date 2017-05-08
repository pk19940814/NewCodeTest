package SwordToOffer.ReverseList;

import java.util.ArrayList;

/**
 * Created by apple on 2017/3/16.
 */
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> list=new ArrayList<Integer>();
        ListNode p=listNode;
        while(p!=null){
            list.add(p.val);


            p=p.next;

        }
        for(int i=0;i<list.size()/2;i++){
            int temp=list.get(i);

            list.set(i,list.get((list.size()-1-i)));
            list.set((list.size()-1-i),temp);

        }
        return list;
    }

}

class ListNode{
    int val;
    ListNode next=null;

    public ListNode(int val) {
        this.val = val;
    }
}