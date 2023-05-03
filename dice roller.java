import java.util.Random;

public class Main {
    int number;
    Random random;

    public static void main(String[] args) {


        Random random=new Random();
        int number=random.nextInt(6)+1;
        System.out.println(number);



    }
}
