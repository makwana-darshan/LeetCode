package leetcode;

import java.util.HashMap;

public class SumofDistances {

    public long[] distance1(int[] nums) {
        long[] res = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    sum += Math.abs(j - i);
                }
            }
            res[i] = sum;
        }
        return res;
    }

    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];
        HashMap<Integer, Long> sumMap = new HashMap<>();
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int val = nums[i];
            long count = countMap.getOrDefault(val, 0);
            long sum = sumMap.getOrDefault(val, 0L);

            res[i] += i * count - sum;

            countMap.put(val, (int) count + 1);
            sumMap.put(val, sum + i);
        }

        sumMap.clear();
        countMap.clear();

        for (int i = n - 1; i >= 0; i--) {
            int val = nums[i];
            long count = countMap.getOrDefault(val, 0);
            long sum = sumMap.getOrDefault(val, 0L);

            res[i] += sum - i * count;

            countMap.put(val, (int) count + 1);
            sumMap.put(val, sum + i);
        }

        return res;
    }
}
