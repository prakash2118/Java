import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st Number: ");
        int num1=input.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("the sum of the number  " +num1+ " and " +num2+   " is"  +sum);

    }
}
