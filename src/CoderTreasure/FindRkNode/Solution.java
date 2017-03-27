package CoderTreasure.FindRkNode;

/**
 * Created by apple on 2017/3/24.
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head==null) return head;
        ListNode p=head;
        for (int i=0;i<k;i++){
            if (p==null) return null;
            p=p.next;
        }
        ListNode q=head;
        while (p!=null){
            p=p.next;
            q=q.next;
        }
        return q;
    }

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}