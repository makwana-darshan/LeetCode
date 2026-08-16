package leetcode;

public class CheckBalancedString {
    public boolean isBalanced(String num) {
    int evenSum=0;
    int oddSum=0;
    int n=num.length();
        for (int i = 0; i <n ; i++) {
            int no=num.charAt(i)-'0';
            if (i%2==0){
                evenSum+=no;
            }else {
                oddSum+=no;
            }
        }
        return evenSum==oddSum;
    }
}
