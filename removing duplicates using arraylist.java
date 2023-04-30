import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(3);
        num.add(2);
        num.add(4);
        num.add(5);
        num.add(7);
        num.add(8);
        num.add(5);
        num.add(6);
        HashSet<Integer> set=new HashSet<>(num);
        num.clear();
        num.addAll(set);

        System.out.println("The list with removed duplicates is :"+num);

    }

}
