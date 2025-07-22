class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> obj=new PriorityQueue<>((a,b)->b-a);
        for(int ans: nums)
        {
            obj.add(ans);
        }
        int count=1;
        while(count<k)
        {
            obj.poll();
            count++;
        }
        return obj.peek();

        
    }
}