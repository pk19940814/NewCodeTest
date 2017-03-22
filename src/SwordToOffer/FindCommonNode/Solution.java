package SwordToOffer.FindCommonNode;

/**
 * Created by apple on 2017/3/19.
 */
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {


        ListNode p1=pHead1,p2=pHead2;
        int k1=0,k2=0;
        while (p1!=null){
            p1=p1.next;
            k1++;
        }
        while (p2!=null){
            p2=p2.next;
            k2++;
        }


        p1=pHead1;
        p2=pHead2;
        while (k2!=k1){
            if (k2>k1){
                k2--;
                p2=p2.next;
            }
            if (k1>k2){
                k1--;
                p1=p1.next;
            }
        }

        if(p1==null||p2==null) return  null;
        while (p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }

return p1;
    }

}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}