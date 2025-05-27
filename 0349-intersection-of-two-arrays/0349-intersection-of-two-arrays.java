class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        for(int v:nums1)
        {
            set1.add(v);
        }
        Set<Integer> set2=new HashSet<>();
        for(int num:nums2)
        {
            if(set1.contains(num))
            {
                set2.add(num);
            }
        }
        int arr[]=new int[set2.size()];
        int count=0;
        for(int v:set2)
        {
            arr[count++]=v;
        }
        return arr;

        
    }
}