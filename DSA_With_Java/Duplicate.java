// WAP to check an array Duplicate element is present or not?

public class Duplicate {
    public static void main(String[] args) {
        int[] array = { 2, 3, 3, 6, 6, 9 };
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate Elements found is = " + array[i]);
                }
            }
        }
    }
}