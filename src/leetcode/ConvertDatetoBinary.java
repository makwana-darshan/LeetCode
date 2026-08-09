package leetcode;

public class ConvertDatetoBinary {
    public String convertDateToBinary(String date) {
        String[] s = date.split("-");
        StringBuilder sb = new StringBuilder();
        int n = s.length;
        for (int i = 0; i < n; i++) {
            sb.append(Integer.toBinaryString(Integer.parseInt(s[i])));
            if (i < n - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }
}
