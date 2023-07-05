// WAP to find the missing element of an array

// Time complexity = O(n)
// Space complexity = O(1)
public class Missing {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 7, 6, 5 };
        int n = array.length;
        // sum of natural numbers is an array - O(1)
        int sum_natural_num = ((n + 1) * (n + 2)) / 2;
        int sum = 0;
        // sum of current elements present in an array -O(n)
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        int missing_element = 0;
        missing_element = sum_natural_num - sum;
        System.out.println("Missing element in an array is = " + missing_element);
    }
}
