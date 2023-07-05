// WAP to find (a^b) given by big value from the user side 

// Approach : Recursion
// Time Complexity: O(log b)

import java.io.*;
import java.util.*;
import java.math.*;

public class Power{
    // function definition
    public static BigInteger powerFind(BigInteger a, int b){
        BigInteger  result, finalresult;
        // base case condition
        if(b == 1){
            return a;
        }

        else{
            // recursive function call
            result = powerFind(a, b/2);
            finalresult = result.multiply(result);
            if(b % 2 == 0){
                return finalresult;
            }
            else{
                return a.multiply(finalresult);
            }

        }

    }

    public static void main(String[] args){
        // function definition
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        BigInteger a = sc.nextBigInteger();
        int b = sc.nextInt();
        // function calling
        BigInteger result = powerFind(a,b);
        System.out.println("a^b is = "+result);
    }
}