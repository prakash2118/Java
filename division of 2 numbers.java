import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 1st number :");
        int a = input.nextInt();
        System.out.println("Enter 2nd number: ");
        int b =input.nextInt();
        int d =(a/b);
        System.out.println("The division of the number "+a+ " and " +b+ " is " +d);
}
}
