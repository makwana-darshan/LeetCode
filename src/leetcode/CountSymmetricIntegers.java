package leetcode;

public class CountSymmetricIntegers {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (i >= 10 && i <= 99) {
                if (i / 10 == i % 10) {
                    count++;
                }
            } else if (i >= 1000 && i <= 9999) {
                int sum1 = i / 1000 + (i / 100) % 10;
                int sum2 = (i / 10) % 10 + i % 10;
                if (sum1 == sum2) {
                    count++;
                }
            }
        }
        return count;
    }
}
