import java.util.Scanner;
public class ValidateAge {
    public static void main(String[] args) {
        int age = 0;
        Scanner in = new Scanner(System.in);
        boolean done = false; // a control variable
        do {

            System.out.println("What is your age");
            if(in.hasNextInt()){
                age=in.nextInt();
                    in.nextLine(); //clear the buffer
                done = true;
                }
            else{
                String thrash = in.nextLine(); //read the bad input
                System.out.println("You must have entered a valid number, not "+thrash);
            }

        } while (!done); //we loop until done is true
    }
}