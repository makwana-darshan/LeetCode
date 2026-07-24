package leetcode;

public class MinimumNumberofChairsinWaitingRoom {
    public int minimumChairs(String s) {
        int count=0;
        int maxChairs=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch=='E'){
                count++;
            }else {
                count--;
            }
            maxChairs=Math.max(count,maxChairs);
        }
        return maxChairs;
    }
}
