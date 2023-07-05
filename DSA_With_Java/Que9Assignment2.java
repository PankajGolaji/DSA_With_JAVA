import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Que9Assignment2 {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the integer: ");

        // Create Scanner object
        Scanner s = new Scanner(System.in);

        // Read the next integer from the screen
        number = s.nextInt();

        if ((number & 1) == 1)
            System.out.println("Given number is odd.");
        else
            System.out.println("Given number is even.");
    }
}

// Approach 
//  We know that any odd number in its binary representation has the last digit (from right1) as 1.
//  We used that concept and simply used the AND operator and operated the given number with 1.
//  We know the binary representation of 1 is also 1 and if the result of AND operator is 1, we can be sure that the
// given number is also odd since AND only returns 1 when both the operating bits are 1.