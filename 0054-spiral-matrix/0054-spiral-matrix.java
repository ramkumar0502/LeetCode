class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> obj=new ArrayList<>();
    int top=0;
     int bottom=matrix.length-1; 
     int right=matrix[0].length-1;
     int left=0;
     while(left<=right && top<=bottom)
     {
        for(int i=left;i<=right;i++)
        {
            obj.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++)
        {
            obj.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom)
        {
        for(int i=right;i>=left;i--)
        {
            obj.add(matrix[bottom][i]);
        }
        bottom--;
        }
        if(left<=right)
        {
        for(int i=bottom;i>=top;i--)
        {
            obj.add(matrix[i][left]);
        }
        left++;
        }
     }
     return obj;
        
    }
}