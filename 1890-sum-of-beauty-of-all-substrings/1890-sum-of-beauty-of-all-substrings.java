class Solution {
    public int beautySum(String s) {
        int sum=0;
       for(int i=0;i<s.length();i++)
       {
          
          int array[]=new int[27];

         for(int j=i;j<s.length();j++)
         {
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            int flag=min;
            int increase_index2=s.charAt(j)-'a'+1;
            array[increase_index2]++;
            for(int val:array)
            {
                if(val>0 && val>max)
                {
                    max=val;
                }
                if(val>0 && val<min)
                {
                    min=val;
                }
            }
            if(max>0 && min!=flag)
            {
                sum+=max-min;
            }
            
         }

       }
       
        return sum;
    }
}