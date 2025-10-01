class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();
        List<Integer> inner=new ArrayList<>(); 
        rec(nums,0,outer,inner,nums.length);
        return outer;


    }
    public static void rec(int a[],int start,List<List<Integer>> outer,List<Integer> inner,int length)
    {
        if(start>=length)
        {
            outer.add(new ArrayList<>(inner));
            return;
        }
        inner.add(a[start]);
        rec(a,start+1,outer,inner,length);
        inner.remove(inner.size()-1);
        rec(a,start+1,outer,inner,length);


    }
}