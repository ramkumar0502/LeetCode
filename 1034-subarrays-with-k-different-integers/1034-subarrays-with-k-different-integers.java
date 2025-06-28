class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return countsubarray(nums,k)-countsubarray(nums,k-1);
    }
    public int countsubarray(int nums[],int size)
    {
        if(size<0)
        {
            return 0;
        }
        Map<Integer,Integer> obj=new HashMap<>();
        int left=0;
        int right=0;
        int count=0;
        while(right<nums.length)
        {
            int c=nums[right];
            obj.put(c,obj.getOrDefault(c,0)+1);
            while(obj.size()>size)
            {
                obj.put(nums[left],obj.getOrDefault(nums[left],0)-1);
                if(obj.get(nums[left])==0)
                {
                    obj.remove(nums[left]);
                }
                left++;
            }
            count=count+right-left+1;
            right++;

        }
        return count;
    }
}