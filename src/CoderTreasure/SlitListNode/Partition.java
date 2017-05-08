package CoderTreasure.SlitListNode;

/**
 * Created by apple on 2017/3/24.
 */

/**
 * Created by apple on 2017/3/24.
 */
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if (pHead==null||pHead.next==null) return null;
        ListNode xl=new ListNode(x),xr=new ListNode(x),p=pHead;
        xl.next=xr;
        ListNode xlp=xl,xrp=xr;
        while (p!=null){
            if (p.val<x){
                xlp.next=new ListNode(p.val);
                xlp=xlp.next;

            }
            else {
                xrp.next=new ListNode(p.val);
                xrp=xrp.next;
            }

            p=p.next;
        }

        xlp.next=xr.next;
        xlp=xl.next;
        xr.next=null;
        xl.next=null;
        return xlp;
    }
}




class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}