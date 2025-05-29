class Solution {
    public long findTheArrayConcVal(int[] nums) {
      int start=0;
      int end=nums.length-1;
      long sum=0;

      long value=0;
      while(start<=end)
      {
        String concat=" ";
        if(start==end)
        {
            concat=String.valueOf(nums[start]);
            value=Long.parseLong(concat);
            sum=sum+value;
            
            break;
        }
        concat=String.valueOf(nums[start]) + String.valueOf(nums[end]);
        value=Long.parseLong(concat);
        sum=sum+value;
        start++;
        end--;

      }
      return sum;
        
    }
}