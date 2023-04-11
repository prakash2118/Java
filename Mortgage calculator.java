import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte months_in_years=12;
        final byte percent=100;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Principle:");
        int principle= scanner.nextInt();

        System.out.println("Annual Interest Rate:");
        float annualInterest= scanner.nextFloat();
        float monthlyInterest=annualInterest/percent/months_in_years;

        System.out.println("Years:");
        int years= scanner.nextInt();
        int noOfPayments=years*months_in_years;

        double mortgage=principle*(monthlyInterest*Math.pow(1+monthlyInterest,noOfPayments)/Math.pow(1+monthlyInterest,noOfPayments)-1);
        String mortgageFormat= NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:"+mortgageFormat);
    }
}
