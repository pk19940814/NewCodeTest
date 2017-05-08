package CoderTreasure.ListNodeAdd;

/**
 * Created by apple on 2017/3/24.
 */

public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        if (a==null||b==null) return null;
        ListNode pa=a,pb=b,c=new ListNode(0),pc=c;


        int flag=0;
        while (pa!=null&&pb!=null){
            int num=pa.val+pb.val+flag;
            flag=num/10;
            num%=10;
            pc.next=new ListNode(num);

            pa=pa.next;
            pb=pb.next;
            pc=pc.next;

        }
        if (pa==null) pa=pb;
        if (pa==null)
        {
            if (flag!=0) {
                pa=new ListNode(flag);
            }
        }
        else {

            pa.val += flag;

        }
        while (pa != null) {
            pc.next = new ListNode(pa.val);
            pa = pa.next;
            pc = pc.next;
        }
        pc=c.next;
        c.next=null;
        return pc;

    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}