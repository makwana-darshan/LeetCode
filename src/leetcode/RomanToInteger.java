package leetcode;

public class RomanToInteger {
    private int getVal(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public int romanToInt(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if ((i + 1) < n && getVal(ch) < getVal(s.charAt(i + 1))) {
                sum -= getVal(ch);
            } else {
                sum += getVal(ch);
            }
        }
        return sum;
    }
}
