import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args){
        ArrayList<Integer> num=new ArrayList<>();
        num.add(15);
        num.add(21);
        num.add(16);
        num.add(98);
        num.add(96);
        num.add(102);
        int max=Collections.max(num);
        int secondMax=Integer.MIN_VALUE;
        for(int i:num){
            if(i!=max && i> secondMax){
            secondMax=i;

            }
        }
        System.out.println("the second largest number is :"+secondMax);

    }

}
