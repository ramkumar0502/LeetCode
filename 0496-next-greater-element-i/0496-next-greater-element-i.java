class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer> st=new Stack<>();
       Map<Integer,Integer> map=new HashMap<>();
       int result[]=new int[nums1.length];
       for(int i=nums2.length-1;i>=0;i--)
       {
        
         while((!st.isEmpty()) && st.peek()<nums2[i])
         {
            st.pop();
         }
        if(st.isEmpty())
        {
            map.put(nums2[i],-1);
        }
        else
        {
            map.put(nums2[i],st.peek());
        }
        st.push(nums2[i]);
       
       }
       int i=0;
       for(int val:nums1)
       {
         result[i++]=map.get(val);
       }
       return result;
        
        
    }
}