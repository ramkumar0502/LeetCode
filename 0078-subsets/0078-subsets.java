class Solution {
 public List<List<Integer>> subsets(int[] nums) {
    int n=nums.length;
    int start=0;
    List<List<Integer>>result =new ArrayList<>();
    List<Integer> temp=new ArrayList<>(); 
    subset(nums,result,temp,n,start) ;
    return result;
}
public void subset(int nums[],List<List<Integer>> result,List<Integer> temp,int n,int start)
{
    if(start>=n)
    {
        result.add(new ArrayList<>(temp));
        return;
    }
    temp.add(nums[start]);
    subset(nums,result,temp,n,start+1);
    temp.remove(temp.size()-1);
    subset(nums,result,temp,n,start+1);

}
}