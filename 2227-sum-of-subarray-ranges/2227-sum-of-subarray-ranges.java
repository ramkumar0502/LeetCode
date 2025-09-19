class Solution {
    public long subArrayRanges(int[] nums) {
        return maxsubarray(nums) - minsubarray(nums);
    }

    public long minsubarray(int nums[])
    {
        Stack<Integer> st=new Stack<>();
        int pse[]=new int[nums.length];
        int nse[]=new int[nums.length];
        
        long total=0;
        for(int i=0;i<nums.length;i++)
        {
            while((!st.isEmpty())&&nums[st.peek()]>nums[i])
            {
                st.pop();
            }
            pse[i]=st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=nums.length-1;i>=0;i--)
        {
          while((!st.isEmpty())&&nums[st.peek()]>=nums[i])
          {
            st.pop();
          }
          nse[i]=st.isEmpty()?nums.length-i:st.peek()-i;
          st.push(i);
        }
        for(int i=0;i<nums.length;i++)
        {
             total+=(long)nums[i]*pse[i]*nse[i];
        }
        return total;
        

    }
    public long maxsubarray(int nums[])
    {
       Stack<Integer> st=new Stack<>();
        long total=0;
        int pge[]=new int[nums.length];
        int nge[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
          while((!st.isEmpty())&&nums[st.peek()]<nums[i])
          {
            st.pop();
          }
          pge[i]=st.isEmpty()?i+1:i-st.peek();
          st.push(i);
        }
        st.clear();
        for(int i=nums.length-1;i>=0;i--)
        {
            while((!st.isEmpty())&&nums[st.peek()]<=nums[i])
            {
              st.pop();
            }
            nge[i]=st.isEmpty()?nums.length-i:st.peek()-i;
            st.push(i);
        }
        for(int i=0;i<nums.length;i++)
        {
            total+=(long)nums[i]*pge[i]*nge[i];
        }
        return total;
    }
}
