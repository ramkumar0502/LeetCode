class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer>obj=new HashMap<>();
        long sum=0;
        long maxsum=0;
        for(int i=0;i<k;i++)
        {
         sum=sum+nums[i];
         obj.put(nums[i],obj.getOrDefault(nums[i],0)+1);
        }
        if(obj.size()==k)
        {
        maxsum=Math.max(maxsum,sum);
        }
        int left=0;
        int right=k;
        while(right<nums.length)
        {
            sum=sum-nums[left];
            obj.put(nums[left],obj.getOrDefault(nums[left],0)-1);
            if(obj.get(nums[left])==0)
            {
             obj.remove(nums[left]);
            }
            sum=sum+nums[right];
            obj.put(nums[right],obj.getOrDefault(nums[right],0)+1);
            if(obj.size()==k)
            {
                maxsum=Math.max(sum,maxsum);
            }
            right++;
            left++;

        }
        return maxsum;

}
}