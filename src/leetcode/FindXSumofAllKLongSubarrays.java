package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindXSumofAllKLongSubarrays {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            }
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort((a, b) -> {
                if (a.getValue().equals(b.getValue())) {
                    return Integer.compare(b.getKey(), a.getKey());
                }
                return Integer.compare(b.getValue(), a.getValue());
            });
            int sum = 0;
            for (int j = 0; j < Math.min(x, list.size()); j++) {
                sum += list.get(j).getKey() * list.get(j).getValue();
            }
            res[i] = sum;
        }
        return res;
    }
}
