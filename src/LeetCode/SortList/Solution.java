package LeetCode.SortList;

import java.util.List;

/**
 * Created by apple on 2017/4/17.
 */
public class Solution {
    // private ListNode result = null;

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;


        return sort(head, null);

    }

    public ListNode sort(ListNode p1, ListNode p2) {
       ListNode head=new ListNode(-1);
        ListNode p=p1.next;
        while (p!=null){
            if (p.val<p1.val){
            }
        }
       return head;
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