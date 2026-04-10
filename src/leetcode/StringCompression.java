package leetcode;

public class StringCompression {
    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        int read = 0, write = 0;

        while (read < chars.length) {
            char current = chars[read];
            int count = 0;

            while (read < chars.length && current == chars[read]) {
                read++;
                count++;
            }
            chars[write++] = current;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}
