class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> result=new ArrayList<>();
       List<Integer>li=new ArrayList<>();
       int sum=0;
       int index=0;
       int n=candidates.length;
       value(candidates,target,sum,result,li,index,n);
       return result;

    }
    public static void value(int candidates[],int target,int sum,List<List<Integer>> result,List<Integer>li,int index,int n)
    {
        if(target==0)
        {
            result.add(new ArrayList<>(li));
            return;
        }
        if(index==n||target<0)
        {
            return;
        }
        li.add(candidates[index]);
        value(candidates,target-candidates[index],sum+candidates[index],result,li,index,n);
        li.remove(li.size()-1);
        value(candidates ,target,sum,result,li,index+1,n);

    }
}