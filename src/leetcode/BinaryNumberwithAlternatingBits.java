package leetcode;

public class BinaryNumberwithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int a = n ^ (n >>> 1);
        return (a & (a + 1)) == 0;
    }
}
