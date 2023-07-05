// Q4. Given an array nums of size n, return the majority element.
// Input: 4,2,7,1,9

import java.util.*;
import java.util.Map;
import java.io.*;

public class HashMapAssignmentQue4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of array: ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TreeMap<Integer, Integer> tm = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            tm.put(arr[i], 1);
        }

        System.out.println("Largest Element of Map is : " + tm.lastEntry().getKey());

    }
}

// Hint use: .lastEntry().getKey() method:
// This method provides reference to the last stored key of map. Use .getKey()
// to get key and .getValue() to get value of that reference.

// Approach:
// 1. We would start traversing the array and will store each element into the TreeMap.
// 2. We would simply return the last key of map.