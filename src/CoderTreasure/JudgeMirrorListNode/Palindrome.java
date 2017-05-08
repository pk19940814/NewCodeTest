package CoderTreasure.JudgeMirrorListNode;

/**
 * Created by apple on 2017/3/24.
 */
public class Palindrome {
    public boolean isPalindrome(ListNode pHead) {
        if (pHead==null) return false;
        // write code here
        String str="";
        ListNode p=pHead;
        while (p!=null){
            str+=p.val;
            p=p.next;
        }
        for (int i=0;i<(str.length())/2;i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
        }
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