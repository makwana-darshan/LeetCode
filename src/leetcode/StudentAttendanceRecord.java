package leetcode;

I

public class StudentAttendanceRecord {
    public boolean checkRecord(String s) {
        if (s.contains("LLL")) {
            return false;
        }
        int n = s.length();
        int countOfA = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                countOfA++;
            }
            if (countOfA > 1) {
                return false;
            }
        }
        return true;
    }
}
