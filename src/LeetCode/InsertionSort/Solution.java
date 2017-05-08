package LeetCode.InsertionSort;

/**
 * Created by apple on 2017/4/20.
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head==null) return null;
        ListNode phead=new ListNode(0);
        phead.next=head;
        sort(phead,head.next,head);
        head=phead.next;

        return head;
    }
    public void sort(ListNode phead,ListNode p,ListNode pre){
        if (phead==null||p==null||pre==null) return;
        if (p.val>=pre.val){
            sort(phead,p.next,p);
            return;
        }

       // ListNode pnext=p.next;
        ListNode temp=phead;
        while (temp.next!=null&&temp!=pre){
            if (temp.next.val>p.val) break;
            temp=temp.next;
        }
        pre.next=p.next;
        p.next=temp.next;
        temp.next=p;


        sort(phead,pre.next,pre);
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}