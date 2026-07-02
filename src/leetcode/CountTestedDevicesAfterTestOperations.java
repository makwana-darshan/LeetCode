package leetcode;

public class CountTestedDevicesAfterTestOperations {
    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        int testCount = 0;
        for (int battery : batteryPercentages) {
            if (battery - testCount > 0) {
                count++;
                testCount++;
            }

        }
        return count;
    }
}
