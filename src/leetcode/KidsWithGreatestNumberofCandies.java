package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > maxCandy) {
                maxCandy = candies[i];
            }
        }
        List<Boolean> list = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxCandy) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
