package leetcode;

public class CalculateMoneyInLeetcodeBank {
    public int totalMoney(int n) {
        int week = n / 7;
        int day = n % 7;
        int weekTotal = 0;
        for (int i = 1; i <= week; i++) {
            weekTotal += 7 * i + 21;
        }
        int start = week + 1;
        int daysTotal = day * start + day * (day - 1) / 2;
        return weekTotal + daysTotal;
    }
}
