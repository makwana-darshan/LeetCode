package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                int totalBit = Integer.bitCount(i) + Integer.bitCount(j);
                if (totalBit == turnedOn) {
                    list.add(String.format("%d:%02d", i, j));
                }
            }
        }
        return list;
    }
}
