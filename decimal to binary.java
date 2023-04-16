import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int decNum;
        int quotient;
        int i=1;
        int j;
        int binNUm[]=new int[100];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        decNum=input.nextInt();

        quotient=decNum;
        while(quotient !=0)
        {
            binNUm[i++]=quotient%2;
            quotient=quotient/2;
        }
        System.out.println("The binary number is : ");
        for(j=i-1;j>0;j--)
        {
            System.out.print(binNUm[j]);
        }

    }
}
