class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int start=1;
        int target=n;
        List<List<Integer>>result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        recursive(start,k,target,result,temp);
        return result;
    }
    public static void recursive(int start,int k,int target,List<List<Integer>> result,List<Integer> temp)
    {
        if(target<0||temp.size()>k)
        {
            return;
        }
        if(target==0 && temp.size()==k)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=9;i++)
        {
            temp.add(i);
            recursive(i+1,k,target-i,result,temp);
            temp.remove(temp.size()-1);
        }
    }
}