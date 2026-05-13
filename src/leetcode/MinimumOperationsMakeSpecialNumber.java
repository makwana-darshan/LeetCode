package leetcode;

public class MinimumOperationsMakeSpecialNumber {
    public int minimumOperations(String num) {
        int n = num.length();
        int ans = num.contains("0") ? n - 1 : n;
        String[] endings = {"00", "25", "50", "75"};

        for (String end : endings) {
            int j = n - 1;
            while (j >= 0 && num.charAt(j) != end.charAt(1)) {
                j--;
            }
            if (j < 0) {
                continue;
            }
            int i = j - 1;
            while (i >= 0 && num.charAt(i) != end.charAt(0)) {
                i--;
            }
            if (i < 0) {
                continue;
            }
            ans = Math.min(ans, n - i - 2);
        }
        return ans;
    }
}
