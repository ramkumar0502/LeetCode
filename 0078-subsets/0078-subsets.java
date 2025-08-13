class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> inner=new ArrayList<>();
        int length=nums.length;
        int start=0;
        call(start,nums,result,inner,length);
        return result;

        
    }
    public void call(int start,int array[],List<List<Integer>> result,List<Integer>inner,int n)
    {
        if(start>=n)
        {
            result.add(new ArrayList<>(inner));
            return;
        }
        inner.add(array[start]);
        call(start+1,array,result,inner,n);
        inner.remove(inner.size()-1);
        call(start+1,array,result,inner,n);

    }
}