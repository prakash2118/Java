import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(15);
        num.add(21);
        num.add(16);
        num.add(98);
        num.add(96);
        num.add(102);
        num.add(69);

        System.out.println("Before reverse: " + num);
        Collections.reverse(num);
        System.out.println("After reversing :" + num);

    }
}
