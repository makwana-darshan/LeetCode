package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindtheSequenceofStringsAppearedontheScreen {
    public List<String> stringSequence(String target) {
        List<String> list = new ArrayList<>(target.length());
        StringBuilder current = new StringBuilder();

        for (char ch : target.toCharArray()) {
            current.append('a');
            list.add(current.toString());
            while (current.charAt(current.length() - 1) != ch) {
                char nextChar = (char) (current.charAt(current.length() - 1) + 1);
                current.setCharAt(current.length() - 1, nextChar);
                list.add(current.toString());
            }
        }

        return list;
    }
}
