package leetcode;

public class FindtheIntegerAddedtoArray {
    public int addedInteger(int[] nums1, int[] nums2) {
        int num1Max = Integer.MIN_VALUE;
        int num2Max = Integer.MIN_VALUE;
        for (int num : nums1) {
            if (num > num1Max) {
                num1Max = num;
            }
        }
        for (int num : nums2) {
            if (num > num2Max) {
                num2Max = num;
            }
        }
        return num2Max - num1Max;
    }
}
