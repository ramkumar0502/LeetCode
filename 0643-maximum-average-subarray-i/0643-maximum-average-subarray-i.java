class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
       
        int left=0;
        int right=k;
        double max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++ )
        {
            sum=sum+nums[i];
        }
        max=Math.max(max,sum);
        while(right<nums.length)
        {
            sum=sum-nums[left];
            sum=sum+nums[right];
            max=Math.max(sum,max);
            left++;
            right++;
        }
        return max/k;

       
        
    }
}