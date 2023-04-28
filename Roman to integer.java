import java.util.Locale;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Roman values:");
        String romanNumeral=input.next().toUpperCase();
        int result=romanToInt(romanNumeral);
        System.out.println("The integer value of "+ romanNumeral+" is " +result);

    }

        public static int romanToInt(String s) {
            int result=0;
            int prevValue=0;
            int currValue=0;
            for (int i=s.length()-1;i>=0;i--){
                char c=s.charAt(i);
                switch(c){
                    case 'I':
                        currValue=1;
                        break;
                    case 'V':
                        currValue=5;
                        break;
                    case 'X':
                        currValue=10;
                        break;
                    case 'L':
                        currValue=50;
                        break;
                    case 'C':
                        currValue=100;
                        break;
                    case 'D':
                        currValue=500;
                        break;
                    case 'M':
                        currValue=1000;
                        break;
                    default:
                        System.out.println("the number you've entered is invalid"+c);
                        return 0;
                }
                if (currValue<prevValue){
                    result-=currValue;
                } else{
                    result+=currValue;
                }
                prevValue=currValue;
            }
            return result;
        }
    }



