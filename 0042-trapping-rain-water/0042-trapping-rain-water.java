class Solution {
    public int trap(int[] height) {
        int arr[]=height;
        int total=0;
        int leftmax=0;
        int rightmax=0;
        int l=0;
        int r=height.length-1;
        while(l<r)
        {
            if(arr[l]<=arr[r])
            {
                if(leftmax > arr[l])
                { 
                    total+=leftmax-arr[l];
                }
                else
                {
                    leftmax=arr[l];
                }
                l++;
            }
            else
            {
                if(rightmax > arr[r])
                {
                    total+=rightmax-arr[r];
                }
                else
                {
                    rightmax=arr[r];
                }
                r--;
            }
        }
        return  total;
        
    }
}
