// Write a function which accepts a 2D array of integers and its size as arguments and displays
//  the elements of middle row and the elements of middle column. Printing can be done in any order.
// [Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]

// Time complexity: O(m) where m = number of rows and for complete code if we consider than it is O(m*m) as we are taking input in 2 for loops.
// Space complexity: O(1)
import java.io.*;
import java.util.*;

public class Que8Assignment1 {
    public static void main(String args[]) {

        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        m = sc.nextInt();

        int arr[][] = new int[m][m];

        int i, j;

        System.out.println("enter the  matrix element : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements  of the middle row and middle column are as follows : ");

        for (i = 0; i < m; i++)
            System.out.print(arr[i][m / 2] + "  ");
        for (j = 0; j < m; j++) {
            if (j == m / 2)
                continue;
            System.out.print(arr[m / 2][j] + "  ");
        }
    }
}