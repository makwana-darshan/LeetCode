package leetcode;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        int carry = 0;

        while (indexA >= 0 || indexB >= 0 || carry > 0) {
            int digitA = 0;
            int digitB = 0;
            if (indexA >= 0) {
                digitA = a.charAt(indexA) - '0';
            }
            if (indexB >= 0) {
                digitB = b.charAt(indexB) - '0';
            }
            int sum = digitA + digitB + carry;
            sb.append(sum % 2);
            carry = sum / 2;
            indexA--;
            indexB--;
        }
        return sb.reverse().toString();
    }
}
