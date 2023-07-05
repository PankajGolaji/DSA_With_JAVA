import java.util.*;

// Greedy Approach
public class candyDistribution {

    static int candyCount(int[] arr) {
        int n = arr.length;
        int dp[] = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        // left to right
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                dp[i] = dp[i + 1] + 1;
            }
        }
        // right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1] && dp[i] <= dp[i + 1] + 1) {
                dp[i] = dp[i + 1] + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            total += dp[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 1 };
        System.out.println(candyCount(arr));
    }
}
