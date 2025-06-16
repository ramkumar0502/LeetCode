class Solution {
    public boolean checkPerfectNumber(int num) {
        int i=0;
        int add=0;
        while(i<num)
        {
            if(i!=0 && num%i==0)
            {
              add=add+i;  
            }
            i++;

        }
        if(add==num)
        {
            return true;
        }
        return false;
        
    }
}