package leetcode;


public class ReverseVowelsofaString {
    public String reverseVowels(String s) {
        int n = s.length();
        if (n == 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = n - 1;
        while (left < right) {
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            while (left < right && !isVowel(chars[right])) {
                right--;
            }
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                ++left;
                --right;
            }
        }
        return new String(chars);
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

//    boolean isVowel(char ch) {
//        return "aeiouAEIOU".indexOf(ch) != -1;
//    }
}
