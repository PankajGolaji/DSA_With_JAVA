import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Que10Assignment2 {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int number;
        System.out.println("Enter the integer: ");

        // Create Scanner object
        Scanner s = new Scanner(System.in);

        // Read the next integer from the screen
        number = s.nextInt();

        int answer = countSetBits(number);
        System.out.println("The number of set bits in the given number are " + answer);
    }
}

// ApproachE
// We have extracted the last digit (from right1, of the number using the AND
// operator. By operating AND operator
// on 1 and the number the corresponding bits of 1 and the number will be ANDed.
// Whatever will be the result of AND we will add it to our “count” variable
// because the result can only be 0 and 1.
// So if there is a set bit it will automatically get summed up in the variable
// “count”.
// Once we are done with the last digit, we need to check upon other digits as
// well.

// ● We know the right shift will remove the last bit from the right end and a
// new bit will take its place.
// ● This way we can check for each bit whether it is set or not.