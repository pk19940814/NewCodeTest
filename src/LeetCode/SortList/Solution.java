package LeetCode.SortList;

import java.util.List;

/**
 * Created by apple on 2017/4/17.
 */
public class Solution {
    // private ListNode result = null;

    public static void main(String[] args) {
        ListNode p1 = new ListNode(2);
        ListNode p2 = new ListNode(5);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(1);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        ListNode p = new Solution().sortList(p1);
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }


    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        return sort(head, null);

    }

    public ListNode sort(ListNode head, ListNode tail) {
        if (head == null || head.equals(tail)) {
            return null;
        }
        ListNode leftHead = new ListNode(-1);
        ListNode leftPr = leftHead;
        ListNode rightHead = new ListNode(-1);
        ListNode rightPr = rightHead;
        ListNode p = head.next;
        ListNode pre = head;

        while (pre != null && p != null) {
            if (p.val < head.val) {
                leftPr.next = p;
                leftPr = leftPr.next;
            } else {
                rightPr.next = p;
                rightPr = rightPr.next;
            }
            p = p.next;
            pre = pre.next;

        }

        leftPr.next = head;
        head.next = rightPr.next;

        ListNode result = sort(leftHead.next, head);
        sort(rightHead.next, null);
        return result;

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