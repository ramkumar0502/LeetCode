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
    public boolean isPalindrome(ListNode head) {
        List<Integer>obj=new ArrayList<>();
        List<Integer> obj2=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null)
       {
         obj.add(temp.val);
         temp=temp.next;
       }
       for(int i=obj.size()-1;i>=0;i--)
       {
        obj2.add(obj.get(i));
       }
       if(obj.equals(obj2))
       {
        return true;
       }
       return false;

        
    }
}