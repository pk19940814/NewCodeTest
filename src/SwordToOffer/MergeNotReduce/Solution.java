package SwordToOffer.MergeNotReduce;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head1=list1,head2=list2;

        ListNode list3=new ListNode(0);
        ListNode head3=list3;
        while(head1!=null&&head2!=null){
            ListNode p;
            if (head2.val<head1.val){
                p=head2;
                head2=head2.next;
            }
            else{
                p=head1;
                head1=head1.next;

            }
            head3.next=p;
            head3=head3.next;



        }
        if (head1==null&&head2!=null) head3.next=head2;
        else if (head1!=null&&head2==null) head3.next=head1;
        list3=list3.next;

        return list3;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}