package leetcode;

public class FindValidPairofAdjacentDigitsinString {
    public String findValidPair(String s) {
        int[] count = new int[10];
        for (char ch : s.toCharArray()) {
            count[ch - '0']++;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            int num1 = s.charAt(i) - '0';
            int num2 = s.charAt(i + 1) - '0';

            if (num1 != num2 && count[num1] == num1 && count[num2] == num2) {
                return num1 + "" + num2;
            }
        }
        return "";
    }
}
