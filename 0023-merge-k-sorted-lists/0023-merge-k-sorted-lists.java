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
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
         ListNode head=null;
         for(ListNode i : lists)
         {
            head= mergeTwoLists(i,head);
         }
         return head;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       if(l1 == null)
       {
         return l2;
       }
       if(l2==null)
       {
         return l1;
       }
       ListNode temp ;
       if(l1.val<=l2.val)
       {
          temp=l1;
          l1=l1.next;
       }
        else{
            temp = l2;
            l2=l2.next;
        }
        ListNode head = temp;
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                temp.next=l1;
                l1=l1.next;
            }
            else{
                 temp.next=l2;
                 l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1==null)
           temp.next=l2;
        else
           temp.next=l1;
        
        return head;

    }
}