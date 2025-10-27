class Solution {
    public int numberOfBeams(String[] bank) {
        int total=0;
        int prev=0;
        int count=0;
        int row=bank.length;
        int column=bank[0].length();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(bank[i].charAt(j)=='1')
                {
                    count++;
                }
            }
            if(count>0&& prev>0)
            {
                total+=prev*count;
            }
            if(count>0)
            {
            prev=count;
            count=0;
            }
        }
        return total;
    }
}