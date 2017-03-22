package SwordToOffer.FindRing;

import java.util.ArrayList;

/**
 * Created by apple on 2017/3/19.
 */
public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode p=pHead;
        ArrayList<ListNode> listNodes=new ArrayList<ListNode>();
        while (p!=null){
            for (ListNode t:listNodes
                 ) {
                if (p==t) return p;
            }
            listNodes.add(p);
            p=p.next;
        }
        return p;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}