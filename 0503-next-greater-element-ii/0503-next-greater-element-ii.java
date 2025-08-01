class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int result[]=new int[nums.length];
        int n=nums.length;
        for(int i=2*(n)-1;i>=0;i--)
        {
            while((!st.isEmpty()) && nums[i%n]>=st.peek())
            {
                st.pop();
            }
           if(i<n)
           {
            result[i] = st.isEmpty() ? -1 : st.peek();
           }
            st.push(nums[i%n]);

        }
       return result;
    }
}