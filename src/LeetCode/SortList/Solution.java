package LeetCode.SortList;

import java.util.List;

/**
 * Created by apple on 2017/4/17.
 */
public class Solution {
    // private ListNode result = null;

    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null) return head;



        return sort(head,null);

    }
    public ListNode sort(ListNode head,ListNode tail){
        if (head==null||head.next==tail||head==tail||head.next==null) return head;
        ListNode p=head.next;
        ListNode lefthead=new ListNode(0),pl=lefthead;
        ListNode righthead=new ListNode(0),pr=righthead;


        while (p!=tail&&p!=null){
            if (p.val<head.val) {
                pl.next=p;
                pl=pl.next;
            }else {
                pr.next=p;
                pr=pr.next;
            }



            p=p.next;

        }

        pl.next=head;
        lefthead=lefthead.next;
        head.next=righthead.next;
        //   System.out.println(head.val);
        // System.out.println(head.next.val);

        head.next=sort(righthead.next,tail);
        return sort(lefthead,head);
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