class Solution {
    public boolean isHappy(int n) {
         return square(n);
      
    }
    public boolean square(int val)
    {
       
        int ans=0;
       while(val !=0)
       {
        int digit=val%10;
         ans=ans + (digit*digit);
        val=val/10;
        if(val==0 && (ans!=1 && ans!=4))
        {
            val=ans;
            ans=0;
        }
        else if(val==0 && ans==1)
        {
            return true;
        }
        if(val==0 && ans==4)
        {
            return false;
        }
       
       }
       return false;
    }
}