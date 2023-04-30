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
        num.add(69);

        num.removeIf(i->i%2==0);
        System.out.println("the removed even number is :"+num);

    }

}
