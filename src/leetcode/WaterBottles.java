package leetcode;

public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int consumed = 0;
        while (numBottles >= numExchange) {
            consumed += numExchange;
            numBottles -= numExchange;
            numBottles += 1;
        }
        return consumed + numBottles;
    }
}
