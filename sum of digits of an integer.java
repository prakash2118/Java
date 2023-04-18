import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer :");
        long num = input.nextLong();
        System.out.println("The sum of digits is " + sumDigits(num));
    }
    public static int sumDigits(long n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;

    }
}
