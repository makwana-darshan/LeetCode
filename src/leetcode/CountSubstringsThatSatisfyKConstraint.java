package leetcode;

public class CountSubstringsThatSatisfyKConstraint {
    public int countKConstraintSubstrings(String s, int k) {
        int left = 0;
        int count0 = 0;
        int count1 = 0;
        int totalSubString = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '0') {
                count0++;
            } else {
                count1++;
            }
            while (count0 > k && count1 > k) {
                char ch1 = s.charAt(left);
                if (ch1 == '0') {
                    count0--;
                } else {
                    count1--;
                }
                left++;
            }
            totalSubString += i - left + 1;
        }
        return totalSubString;
    }
}
