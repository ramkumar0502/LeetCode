/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummy=null;
        Map<ListNode,Integer>obj=new LinkedHashMap<>();
        while(headA!=null)
        {
            obj.put(headA,1);
            headA=headA.next;
        }
        while(headB !=null)
        {
          if(obj.containsKey(headB))
          {
              return headB;
          }
          headB=headB.next;
        }
        return dummy;
        
    }
}