// WAP to print the multiple of number --> (12, 5) = 12 24 36 48 60

public class printMultiple {
    public static void printMulti(int n, int k) {
        if (k == 1) {
            System.out.println(n);
            return;
        }
        printMulti(n, k - 1);
        System.out.println(n * k);

    }

    public static void main(String[] args) {
        printMulti(24, 5);
        System.out.println();
    }

}
