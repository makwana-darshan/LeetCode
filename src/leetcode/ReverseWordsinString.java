package leetcode;

public class ReverseWordsinString {
    public String reverseWords(String s) {
        String[] arr = s.replaceAll("\\s+", " ").trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

}
