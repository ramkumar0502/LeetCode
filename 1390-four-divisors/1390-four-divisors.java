class Solution {
    public int sumFourDivisors(int[] nums) { 
        int start=0;
        int count=0;
        int answer=0;
    
        while(start < nums.length) 
        {
            count=0;
            int sum=0;
            for(int i=1;i*i<=nums[start] ;i++)
            {
                if(nums[start] %i==0)
                {
                    if(count<=4)
                    {
                       int q=nums[start]/i;
                    
                       if(i!=q)
                       {
                        sum+=i+q;
                        count=count+2;
                       }
                       else
                       {
                        sum+=i;
                       count++;
                       }
                    }
                }
              
            }
            if(count==4)
            {
                  answer+=sum;
            }
            start++;
        } 
     
       return answer;

    }
}