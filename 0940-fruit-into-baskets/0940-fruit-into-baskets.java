class Solution {
    public int totalFruit(int[] fruits) {
      Map<Integer,Integer>obj=new HashMap<>();
      int right=0;
      int left=0;
      int maxlength=0;
      while(right<fruits.length)
      {
        obj.put(fruits[right],obj.getOrDefault(fruits[right],0)+1);
        while(obj.size()>2)
        {
          obj.put(fruits[left],obj.getOrDefault(fruits[left],0)-1);
          if(obj.get(fruits[left])==0)
          {
            obj.remove(fruits[left]);
          }
          left++;
        }
        maxlength=Math.max(maxlength,right-left+1);
        right++;


      }
      return maxlength;
    }
} 