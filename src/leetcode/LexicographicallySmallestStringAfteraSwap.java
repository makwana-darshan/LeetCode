package leetcode;

public class LexicographicallySmallestStringAfteraSwap {
    public String getSmallestString(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == arr[i + 1] % 2 && arr[i] > arr[i + 1]) {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                return new String(arr);
            }
        }
        return s;
    }
}
