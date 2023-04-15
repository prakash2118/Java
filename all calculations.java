import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the 2nd Number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(mod);
    }
}
