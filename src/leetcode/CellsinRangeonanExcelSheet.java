package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CellsinRangeonanExcelSheet {
    public List<String> cellsInRange(String s) {
        char startCol = s.charAt(0);
        char endCol = s.charAt(3);
        int startRow = s.charAt(1) - '0';
        int endRow = s.charAt(4) - '0';
        List<String> res = new ArrayList<>();
        for (char col = startCol; col <= endCol; col++) {
            for (int row = startRow; row <= endRow; row++) {
                res.add("" + col + row); // ✅ build cell string!
            }
        }
        return res;
    }
}
