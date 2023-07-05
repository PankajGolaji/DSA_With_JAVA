// write a program to print the elements of both the diagonals in a sser inpstted sqsare matrix in any order. 
// 1 2 3
// 4 5 6
// 7 8 9

// Time complexity: O(n*n)NwhereNnN=NnumberNofNrow8
// Space complexity: O(1)
// import java.io.*;
// import java.util.*;

// public class Que7Assignment1 {
//     public static void main(String args[]) {

//         int m, n;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of rows : ");
//         m = sc.nextInt();
//         System.out.print("enter the number of column : ");
//         n = sc.nextInt();
//         int arr[][] = new int[m][n];

//         int i, j;

//         System.out.println("enter the  matrix element : ");
//         for (i = 0; i < m; i++) {
//             for (j = 0; j < n; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Elements of both the diagonals are as follows : ");
//         for (i = 0; i < m; i++) {
//             for (j = 0; j < n; j++) {
//                 if (i + j == m - 1)
//                     System.out.print(arr[i][j] + "  ");
//                 else if (i == j)
//                     System.out.print(arr[i][j] + "  ");
//             }
//         }
//     }
// }


// Approach Second

// Time c[mplexity:NO(n)NwhereNnN=NnumberNofNrow8
// Space c[mplexity:NO(1)
import java.io.*;
import java.util.*;

public class Que7Assignment1 {
    public static void main(String args[]) {

        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        m = sc.nextInt();
        System.out.print("enter the number of column : ");
        n = sc.nextInt();
        int arr[][] = new int[m][n];

        int i, j;

        System.out.println("enter the  matrix element : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements of both the diagonals are as follows : ");

        // As we have a square matrix, and we know this special property of Diagnol
        // element, then for one diagonal both indices are same and for other the sum of
        // both = m-1.
        // So we will optimise our solution by just traversing one time and getitng both
        // the values. To skip middle element twice we will add an check extra i.e. i!=
        // m-1-i
        for (i = 0; i < m; i++) {
            System.out.print(arr[i][i] + "  ");

            if (i != m - 1 - i)
                System.out.print(arr[i][m - 1 - i] + "  ");
        }
    }

}