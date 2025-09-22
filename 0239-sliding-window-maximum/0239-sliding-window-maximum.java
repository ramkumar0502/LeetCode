import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> li = new ArrayList<>();
        Deque<Integer> obj = new ArrayDeque<>();
        
        for (int i = 0; i < nums.length; i++) {
        
            if (!obj.isEmpty() && obj.peekFirst() <= i - k) {
                obj.pollFirst();
            }
            while (!obj.isEmpty() && nums[obj.peekLast()] <= nums[i]) {
                obj.pollLast();
            }
            obj.offerLast(i);
            
          
            if (i >= k - 1) {
                li.add(nums[obj.peekFirst()]);
            }
        }
        int[] result = new int[li.size()];
        for (int i = 0; i < li.size(); i++) {
            result[i] = li.get(i);
        }
        return result;
    }
}
