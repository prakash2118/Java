import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(3);
        num.add(5);
        num.add(4);
        num.add(9);
        num.add(8);
        num.add(7);
        num.add(0);
        num.add(6);
        System.out.println("The list before sorting :"+num);
        Collections.sort(num);
        System.out.println("The list after sorting :"+num);
    }

}
