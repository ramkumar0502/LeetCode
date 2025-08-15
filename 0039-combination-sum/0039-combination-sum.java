class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        
        call(candidates,0,0,target,result,current);
        return result;

    }
    public void call(int[] candidates,int start,int sum,int target,List<List<Integer>> result,List<Integer> current)
    {
        
        if(target==0)
        {
            result.add(new ArrayList<>(current));
            return;
        }
 
        if(start==candidates.length || target<0)
        {
            return;
        }
       
        sum+=candidates[start];
        current.add(candidates[start]);
        target-=candidates[start];
        call(candidates,start,sum,target,result,current);
        sum-=candidates[start];
        current.remove(current.size()-1);
        target+=candidates[start];
        call(candidates,start+1,sum,target,result,current);
    }
}