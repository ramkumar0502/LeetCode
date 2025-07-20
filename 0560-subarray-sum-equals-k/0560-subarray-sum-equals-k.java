class Solution {
    public int subarraySum(int[] nums, int k) {
       Map<Integer,Integer> obj=new HashMap<>();
       obj.put(0,1);
       int sum=0;
       int count=0;
       for(int i=0;i<nums.length;i++)
       {
        sum+=nums[i];
        if(obj.containsKey(sum-k))
        {
            count+=obj.get(sum-k);
        }
        obj.put(sum,obj.getOrDefault(sum,0)+1);

       }
       return count;
       
     
    }
}