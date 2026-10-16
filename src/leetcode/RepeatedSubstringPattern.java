package leetcode;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        String doubles = s + s;
        String s1 = doubles.substring(1, doubles.length() - 1);
        return s1.contains(s);
    }
}
