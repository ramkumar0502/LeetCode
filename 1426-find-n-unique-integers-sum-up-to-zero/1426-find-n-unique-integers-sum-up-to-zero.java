class Solution {
    public int[] sumZero(int n) {
        int a[]=new int[n];
        int j=0;
        for(int i=1;i<=n/2;i++)
        {
            a[j++]=i;
            a[j++]=-i;    
        }
        if(a.length%2==1)
        {
            a[j]=0;
        }
        return a;
        
    }
}