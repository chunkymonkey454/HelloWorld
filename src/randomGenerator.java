import java.util.Random;

public class randomGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(); // any number
        int num2 = rand.nextInt(10); // number between 0 and 9
        int num3 = rand.nextInt(4, 20); //number between 4 and 19
        System.out.println("Any number "+num1);
        System.out.println("Number between 0 and 9 "+num2);
        System.out.println("Number between 4 and 19" +num3);


    }
}
