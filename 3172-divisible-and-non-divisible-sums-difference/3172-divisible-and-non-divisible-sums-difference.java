class Solution {
    public int differenceOfSums(int n, int m) {
        int div=0;
        int ndiv=0;
        for(int i=0;i<=n;i++)
        {
            if(i%m==0)
            {
                div=div+i;
            }
            else
            {
                ndiv=ndiv+i;
          
            }
        }
        return ndiv-div;
        
    }
}