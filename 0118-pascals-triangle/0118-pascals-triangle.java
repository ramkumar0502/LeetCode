class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerlist=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
           List<Integer> innerlist=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    innerlist.add(1);
                }
                else
                {
                innerlist.add(outerlist.get(i-1).get(j-1)+outerlist.get(i-1).get(j));
                }

            }
            outerlist.add(innerlist);
    

        }
        return outerlist;
        
    }
}