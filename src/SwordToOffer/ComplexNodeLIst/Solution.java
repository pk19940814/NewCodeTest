package SwordToOffer.ComplexNodeLIst;

import java.util.ArrayList;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {

    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead==null) return null;
       RandomListNode p=pHead;
       while (p!=null){
           RandomListNode temp=new RandomListNode(p.label);
           temp.next=p.next;
           p.next=temp;

           p=temp.next;
       }

       p=pHead;
       while (p!=null){
           if (p.random!=null)
           p.next.random=p.random.next;
           p=p.next.next;
       }

       RandomListNode head=pHead.next;
       p=pHead;
       RandomListNode pn=pHead.next;
       while (p!=null){
          p.next=pn.next;
          if (pn.next!=null){
              pn.next=pn.next.next;
          }

           pn=pn.next;
           p=p.next;
       }

       return head;

    }




}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}