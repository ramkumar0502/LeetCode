class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        int start=0;  
        recursion(candidates,target,start,result,temp);
        return result;
}

public void recursion (int candidates[],int target,int start,List<List<Integer>> result,List<Integer> temp)
{
    if(target==0)
    {
        result.add(new ArrayList<>(temp));
        return;
    }
    if(target<0||start==candidates.length)
    {
        return;
    }
    temp.add(candidates[start]);
    recursion(candidates,target-candidates[start],start,result,temp);
    temp.remove(temp.size()-1);
    recursion(candidates,target,start+1,result,temp);
}
}