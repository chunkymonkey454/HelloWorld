import java.util.Scanner;
public class birthMonth {
    public static void main(String[] args) {
        int birthMonth = 0; //must be from 1-12
        Scanner in = new Scanner(System.in);

        boolean done = false; //control variable
        do {
            System.out.println("Enter your birthmonth by number");
            if (birthMonth >= 1 && birthMonth <= 12) {
                birthMonth = in.nextInt();
                done = true;
            } else {
                String thrash = in.nextLine();
                System.out.println("You must enter a proper integer between 1 and 12, not " + thrash);


            }
            while (!done) ;
        }
    }

}


