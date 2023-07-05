public class sumDigits {
    public static int sumOfDigits(int num){
        // Base case
        if(num == 0){
            return 0;
        }
        // Recursive call
        return (num % 10) + sumOfDigits(num/10);
    }
    public static void main(String[] args){
        int num = 1234;
        int result = sumOfDigits(num);
        System.out.println("The number of sum is:"+result);
    }
}
