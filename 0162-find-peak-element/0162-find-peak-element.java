class Solution {
    public int findPeakElement(int[] nums) {
        int a[]=nums;
        int start=0;
        int end=nums.length-1;
        if(nums.length==1)
        {
            return 0;
        }
        while(start<=end)
        {
          int mid=(start+end)/2;
    
          if(mid==0)
          {
            if(a[mid]>a[mid+1])
            {
                return mid;
            }
            else
            {
                return mid+1;
            }
          }
          else if(mid==nums.length-1)
          {
            if(a[mid]>a[mid-1])
            {
                return mid;
            }
            else
            {
                return mid-1;
            }

          }
          else if( a[mid]>a[mid-1]&&a[mid]>a[mid+1])
          {
              return mid;
          }
         
          else if(a[mid]<a[mid+1])
          {
            start=mid+1;
          }
          else 
          {
            end=mid-1;
          }
        }
        return -1;

        
    }
}