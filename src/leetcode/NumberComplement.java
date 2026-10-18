package leetcode;

public class NumberComplement {
    public int findComplement(int num) {
        int bitLength = 32 - Integer.numberOfLeadingZeros(num);
        int mask = (1 << bitLength) - 1;
        return num ^ mask;
    }
}
