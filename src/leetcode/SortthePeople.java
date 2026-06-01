package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortthePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort(Collections.reverseOrder());
        String[] height = new String[names.length];
        int index = 0;
        for (Integer h : list) {
            height[index++] = map.get(h);
        }
        return height;
    }
}
