class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> obj=new HashMap<>();
        obj.put(0,1);
        int count=0;
        int sum=0;
        if(nums.length==1 && Math.abs(nums[0])!=k)
        {
            return 0;
        }
        for(int i=0;i<nums.length;i++)
        {
             sum+=nums[i];
            int val=((sum%k)+k)%k;
            if(obj.containsKey(val))
            {
                count+=obj.get(val);
            }
            obj.put(val,obj.getOrDefault(val,0)+1);
        }
        return count;
        
    }
}