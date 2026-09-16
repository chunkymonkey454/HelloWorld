public class BooleanVariable {
    public static void main(String[] args) {
    boolean isNum= true;
    boolean isNotNum= false;
    int num = 10;

    // if number modulo 2 is not equal to zero
        // this will be false (0 is not equal to 0)
    boolean isOdd= num % 2 != 0;

    // if number modulo 2 is equal to zero
        // this will be true (0 is equal to 0)
    boolean isEven= num % 2 == 0;
        System.out.println("Is " + num + " an odd number " + isOdd);
        System.out.println("Is "+num+" an even number "+isEven);
    }

}
