package leetcode;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int len = 0;
        int n = s.length() - 1;
        for (int i = n; i >= 0; i--) {
            if (s.charAt(i) == '-') {
                continue;
            }
            if (len > 0 && len % k == 0) {
                sb.append('-');
            }
            sb.append(Character.toUpperCase(s.charAt(i)));
            ++len;
        }
        return sb.reverse().toString();
    }
}
