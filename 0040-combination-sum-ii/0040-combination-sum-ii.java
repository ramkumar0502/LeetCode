class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(candidates);
        int start=0;
        int remains=target;
         recursion(candidates,result,temp,start,remains);
        return result;
    }
    public static void recursion(int [] candidates,List<List<Integer>>result,List<Integer>temp,int start,int remains)
    {
        if(remains==0)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        if(remains<0)
        {
            return;
        }
        for(int i=start;i<candidates.length;i++)
        {
            if(i>start && candidates[i]==candidates[i-1])
            {
                continue;
            }
            if(candidates[i]>remains)
            {
              break;
            }
            temp.add(candidates[i]);
            recursion(candidates,result,temp,i+1,remains-candidates[i]);
            temp.remove(temp.size()-1);

        }
    }
}