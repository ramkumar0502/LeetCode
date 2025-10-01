class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinked=numBottles;
        int newbottles=0;
        while((numBottles/numExchange)>=1)
        {
            newbottles=numBottles/numExchange;
            drinked+=newbottles;
            numBottles=newbottles + numBottles%numExchange;
        }
        return drinked;
        
    }
}