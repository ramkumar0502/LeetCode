/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Map<ListNode,Integer>obj=new HashMap<>();
        ListNode temp=head;
        while(temp!=null)
        {
            int count=0;
            if(obj.containsKey(temp))
            {
                return temp;
            }
            obj.put(temp,count);
            count++;
            temp=temp.next;
        } 
        return null;      
    }
}