class Solution {
    public int minimumRecolors(String blocks, int k) {
     
        int left=0;
        int wcount=0;
         int min=Integer.MAX_VALUE;
        for(int right=0;right<blocks.length();right++)
        {
           
            if(blocks.charAt(right)=='W')
            {
                wcount++;
            }
            if(right-left+1==k)
            {
                min=Math.min(min,wcount);

            if(blocks.charAt(left)=='W')
            {
                wcount--;
            }
            left++;
            }

        }
        return min;
        
    }
}