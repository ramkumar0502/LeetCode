class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> obj=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        int result[]=new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--)
        {
            while((!st.isEmpty())&& nums2[i]>st.peek())
            {
                st.pop();
            }
            if(st.isEmpty())
            {
               obj.put(nums2[i],-1);
            }
            else
            {
                obj.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        int count=0;
        for(int val:nums1)
        {
            result[count++]=obj.get(val);
        }
        return result;
       
        
        
    }
}