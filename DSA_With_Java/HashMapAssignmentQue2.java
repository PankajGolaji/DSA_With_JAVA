// Q2.Implement a Map in java which takes the input and print the list in sorted order based on value.
// Input: 5- Rahul, 7 Lakshman, 1 Ram, 4 Krrish, 2 Lakshay,

import java.util.*;
import java.util.Map;
import java.io.*;

public class HashMapAssignmentQue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of Key-pair: ");

        int n = sc.nextInt();

        TreeMap<String, Integer> tm = new TreeMap<>();

        System.out.print("Enter the elements in Key and value : ");
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            String value = sc.next();
            tm.put(value, key);
        }

        System.out.println("The value of Map is: " + tm);

    }
}