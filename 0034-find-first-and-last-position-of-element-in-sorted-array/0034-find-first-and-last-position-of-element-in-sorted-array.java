class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0)
        {
            return new int[]{-1,-1};
        }
        else
        {
            int first=fsearch(nums,target);
            int last=lsearch(nums,target);
            return new int[]{first,last};

        }
    }
        public int fsearch(int nums[],int target)
        {
            int start=0;
            int end=nums.length-1;
            int index=-1;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(nums[mid]==target)
                {
                    index=mid;
                    end=mid-1;
                }
                else if(nums[mid]>target)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            return index;
        }

        public int lsearch(int nums[],int target)
        {
            int start=0;
            int end=nums.length-1;
            int index=-1;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(nums[mid]==target)
                {
                    index=mid;
                      start=mid+1;
                }
                else if(nums[mid]>target)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            return index;
        }


      
        
        
    }
