/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


/*class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode current=head;
        while(current!=null)
        {
            ListNode Nextnode=current.next;
            current.next=prev;
            prev=current;
            current=Nextnode;
        }
        return prev;
    }
}*/
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
         return null;
        Stack<ListNode> s= new Stack<>();
        ListNode current=head;
        while(current!=null)
        {
           s.push(current);
           current=current.next;
        }

        ListNode newhead=s.pop();
        ListNode temp=newhead;
        while(!s.isEmpty())
        {
           temp.next=s.pop();
           temp=temp.next;
        }
        temp.next=null;
        return newhead;
    }
}