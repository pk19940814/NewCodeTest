package SwordToOffer.DeleteNodeAgain;

/**
 * Created by apple on 2017/3/18.
 */
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead==null||pHead.next==null) return pHead;
        if (pHead.val!=pHead.next.val) pHead.next=deleteDuplication(pHead.next);
        else {
            ListNode p=pHead.next;
            while (p!=null&&p.val==pHead.val){
                p=p.next;
            }
            pHead=deleteDuplication(p);
        }
        return pHead;


    }

}
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}