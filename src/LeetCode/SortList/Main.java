package LeetCode.SortList;

/**
 * Created by apple on 2017/4/17.
 */
public class Main {
    public static void main(String[] args){
        Solution s=new Solution();
        ListNode p=new ListNode(4);
        ListNode ptemp=p;
       ptemp.next=new ListNode(19);
        ptemp=ptemp.next;
       ptemp.next=new ListNode(14);
        ptemp=ptemp.next;
        ptemp.next=new ListNode(5);
        ptemp=ptemp.next;
       ptemp.next=new ListNode(-3);
        ptemp=ptemp.next;
        ptemp.next=new ListNode(1);
        ptemp=ptemp.next;
        ptemp.next=new ListNode(8);
        ptemp=ptemp.next;
       ptemp.next=new ListNode(5);
        ptemp=ptemp.next;
        ptemp.next=new ListNode(11);
        ptemp=ptemp.next;
        ptemp.next=new ListNode(15);
      ListNode pr=s.sortList(p);

       // ListNode q=new ListNode(0);
       // q.next=new ListNode(-3);
       // ListNode pr=s.sortList(q);

        while (pr!=null){
            System.out.println(pr.val+"  ober");
            pr=pr.next;
        }
    }
}
