package leetcode;

public class SubstringMatchingPattern {
    public boolean hasMatch(String s, String p) {
        int idx = p.indexOf('*');
        String pre = p.substring(0, idx);
        String suf = p.substring(idx + 1);

        int leftMatch = s.indexOf(pre);
        if (leftMatch == -1) {
            return false;
        }
        int startIndex = leftMatch + pre.length();
        int rightMatch = s.indexOf(suf, startIndex);

        return rightMatch != -1;
    }
}
