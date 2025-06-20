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
    public int getDecimalValue(ListNode head) {
        int sum=0;
        int power=0;
        int ans=0;
        List<Integer>obj=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            obj.add(temp.val);
            temp=temp.next;
        }
        int length=obj.size()-1;
        for(int i=length;i>=0;i--)
        {
           ans=obj.get(i).intValue()*(int)Math.pow(2,power);
           sum=sum+ans;
           power++;
        }
        return sum;
        
    }
    
}