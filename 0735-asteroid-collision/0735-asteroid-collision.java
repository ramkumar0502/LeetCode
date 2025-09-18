class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       int top=-1;
       int st[]=new int[asteroids.length];
       for(int i=0;i<asteroids.length;i++)
       {
         while(top>=0 && st[top]>0 && asteroids[i]<0 && st[top]<-asteroids[i])
         {
            top--;
         }
         if(top>=0 && st[top]>0 && asteroids[i]<0 && st[top]>-asteroids[i])
         {
            continue;
         }
         else if(top>=0 && st[top]>0 && asteroids[i]<0 && st[top]==-asteroids[i])
         {
            top--;
            continue;
         }
         else
         {
            st[++top]=asteroids[i];
         }
       }
       int result[]=new int[top+1];
       for(int i=0;i<result.length;i++)
       {
        result[i]=st[i];
       }
       return result;
    }
}