class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
    
       return subarraycount(nums,goal)-subarraycount(nums,goal-1);
    }
    public int subarraycount(int nums[],int k)
    {
        if(k<0)
        {
            return 0 ;
        }
        int count=0;
        int right=0;
        int left=0;
        int sum=0;
        while(right<nums.length)
        {
            sum=sum+nums[right];
            while(sum>k && left<nums.length)
            {
                sum=sum-nums[left];
                left++;
            }
            if(sum<=k)
            {
                count=count+right-left+1;
            }
            right++;
        }
        return count;
    }
}