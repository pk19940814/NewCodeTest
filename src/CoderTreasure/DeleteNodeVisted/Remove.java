package CoderTreasure.DeleteNodeVisted;

/**
 * Created by apple on 2017/3/24.
 */
public class Remove {
    public boolean removeNode(ListNode pNode) {
        // write code here
        ListNode p=pNode;
        if (p.next==null) return false;
        while (p.next!=null){
            p.val=p.next.val;
            p=p.next;
        }
        p.next=null;

        return true;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}