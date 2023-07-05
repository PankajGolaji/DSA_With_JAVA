import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Que11Assignment2 {
    public static int findOddOccuring(int[] arr) {
        int xor = 0;
        for (int i : arr) {
            xor = xor ^ i;
        }
        return xor;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        // reading the number of elements from the that we want to enter
        n = sc.nextInt();
        // creates an array in the memory of length 10
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            // reading array elements from the user
            array[i] = sc.nextInt();
        }
        System.out.println("The odd occurring element is " + findOddOccuring(array));
    }
}

// Approach:
// Some key observations about 1or operator.
// . XOR of ‘x’ with 0.
// . x ^ 0 = x
// . XOR of ‘x’ with itself even number of times.
// . x ^ x = 0
// . XOR of ‘x’ with itself odd number of times.
// . (x ^ x ^ x) = (x ^ (x ^ x)) = (x ^ 0) = x
// . (x ^ x ^ x ^ x ^ x) = (x ^ (x ^ x) ^ (x ^ x)) = (x ^ 0 ^ 0) = x
// . This shows taking 1or of the same number an odd number of times results in
// the number itself whereas taking
// xor even number of times will result in 0.
// . So, if we take XOR of all array elements, even appearing elements will
// cancel each other, and we are left with
// the only odd appearing element.
// . We will simply return that element.