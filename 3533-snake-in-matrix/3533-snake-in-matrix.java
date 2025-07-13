class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int row=0;
         int col=0;
        for(String cmd:commands)
        {
            switch(cmd)
            {
                case "UP":
                  row--;
                  break;
                case "DOWN":
                  row++;
                  break;
                case "LEFT":
                  col--;
                  break;
                case "RIGHT":
                 col++;
                 break;
                  
                
            }
        }
        return (n*row)+col;


        
    }
}