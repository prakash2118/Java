import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int row = 1; row <n; row++) {
            for (int col =1; col<row;col++) {
                System.out.print(" ");
            }
            for (int k = n; k >=row; k--) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=row; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }


    }




        // System.out.println("Hello world!");
    }
