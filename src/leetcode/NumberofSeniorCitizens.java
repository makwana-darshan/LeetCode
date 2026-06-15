package leetcode;

public class NumberofSeniorCitizens {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String s : details) {
            int num = (s.charAt(11) - '0') * 10 + (s.charAt(12) - '0');
            if (num > 60) {
                count++;
            }
        }
        return count;
    }
}
