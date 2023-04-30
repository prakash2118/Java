import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side x : ");
        x = input.nextDouble();
        System.out.print("Enter side y : ");
        y = input.nextDouble();

        z = Math.sqrt((x * x) + (y * y));
        System.out.println("The hypotenuse value is : " + z);
    }
}
