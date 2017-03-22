package SwordToOffer.ListNodeKth;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {

        ListNode pre,last;
        pre=head;
        last=head;

        for(int i=0;i<k;i++){
            if (pre==null) return null;
            pre=pre.next;

        }
        while (pre!=null){
            pre=pre.next;
            last=last.next;
        }
        return last;
    }


}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
