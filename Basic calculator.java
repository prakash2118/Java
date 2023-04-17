import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        double num1,num2,result;
        char operator;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        num1= input.nextDouble();
        System.out.println("Enter the 2nd number : ");
        num2= input.nextDouble();
        System.out.println("Enter the operator('+','-','*','/':)");
        operator=input.next().charAt(0);
        switch (operator){
            case '+':
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + result);
                break;

            case'/':
                if (num2==0) {
                    System.out.println("ERROR cannot divide it by 0: ");
                }
                else {
                    result = num1 / num2;
                    System.out.println(num1 + "/" + num2 + "=" + result);
                }
                break;
                default:
                    System.out.println("ERROR :the value is invalid");
                    break;

                }


            }

        }


