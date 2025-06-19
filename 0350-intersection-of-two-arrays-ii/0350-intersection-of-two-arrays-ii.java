class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      Map<Integer,Integer>obj1=new HashMap<>();
      for(Integer value:nums1)
      {
        obj1.put(value,obj1.getOrDefault(value,0)+1);
      }
      List<Integer> list=new ArrayList<>();

      for(Integer value:nums2)
      {
          if(obj1.containsKey(value)&&obj1.get(value)>0)
          {
            list.add(value);
            obj1.put(value,obj1.getOrDefault(value,0)-1);

          }
      }
      int arr[]=new int[list.size()];
      int count=0;
      for(int value:list)
      {
        arr[count++]=value;

      }
      return arr;


        
    }
}