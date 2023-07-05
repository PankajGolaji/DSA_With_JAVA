// Auxiliary Given a pattern containing only I's and D's. I for increasing and D for decreasing. Device an algorithm to print the minimum number following that pattern. Digits from 1-9 and digits can't repeat.
// Input: D       Output: 21
// Input: I       Output: 12
// Input: DD       Output: 321
// Input: II      Output: 123

import java.util.*;

public class Stacko1Example {
    public static void main(String[] args) {
        String str = "IID";
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <= str.length(); i++) {
            st.push(i + 1);

            if (i == str.length() || str.charAt(i) == 'I') {
                while (!st.isEmpty()) {
                    System.out.println(st.pop());
                }
            }
        }
        // System.out.println(st);
    }
}
