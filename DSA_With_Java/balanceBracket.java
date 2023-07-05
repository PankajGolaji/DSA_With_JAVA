import java.util.*;

// Greedy approach
public class balanceBracket {

    static long swapCount(String s) {
        char[] chars = s.toCharArray();
        int countL = 0, countR = 0, swap = 0, imbalance = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '[') {
                countL++;
                if (imbalance > 0) {
                    swap += imbalance;
                    imbalance--;
                }
            } 
            else if (chars[i] == ']') {
                countR++;
                imbalance = (countR - countL);
            }
        }
        return swap;
    }


    public static void main(String[] args) {
        String s = "[]][][";
        System.out.println(swapCount(s));

        String s1 = "[[][]]";
        System.out.println(swapCount(s1));
    }
}