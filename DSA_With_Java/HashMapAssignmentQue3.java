// Q3. Detect if an Array contains a duplicate element. At Most 1 duplicate would be there.
// Input: 1,2,3,4

import java.util.*;
import java.util.Map;
import java.io.*;

public class HashMapAssignmentQue3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of array: ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> tm = new HashMap<>();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (tm.containsKey(arr[i])) {
                System.out.println("Yes");
                answer = 1;
                break;
            }
            tm.put(arr[i], 1);
        }

        if (answer == 0)
            System.out.println("No");

    }
}

// Approach:
// 1. We would start traversing the array.
// 2. As me move ahead, we would keep adding the element in map.
// 3. If we found any element is already added in the map that means we have found our duplicate.
// 4. If no element is found then there is no duplicate.