package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberofOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>(arr.length);
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>(arr.length);
        set.addAll(map.values());

        return set.size() == map.size();
    }
}
