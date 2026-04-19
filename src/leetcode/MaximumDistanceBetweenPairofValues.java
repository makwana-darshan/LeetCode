package leetcode;

public class MaximumDistanceBetweenPairofValues {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int maxDist = 0;
        int size1 = nums1.length, size2 = nums2.length;

        while (i < size1 && j < size2) {
            if (nums1[i] <= nums2[j]) {
                maxDist = Math.max(maxDist, j - i);
                j++;
            } else {
                i++;
            }
        }
        return maxDist;
    }
}
