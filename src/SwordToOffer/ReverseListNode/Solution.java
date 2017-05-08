package SwordToOffer.ReverseListNode;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head==null) return null;
        ListNode pre=head.next;
        ListNode p=head;
        ListNode last=null;

        while(pre!=null){

            p.next=last;
            last=p;
            p=pre;

            pre=pre.next;

        }

        p.next=last;
        head=p;

        return head;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
