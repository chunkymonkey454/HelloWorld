import java.util.Scanner;
public class FavoriteNumber {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int favNum = 0; //must be a number between 1 and 10
        String thrash=""; // store invalid input
        boolean done = false; //control variable
        do{
            System.out.println("Enter your favorite number between 1 and 10");
            if(in.hasNextInt()){

                favNum = in.nextInt();
                in.nextLine(); //clear the buffer
                //Now we enforce that the number is within the range
                if(favNum >=1 && favNum <=10){
                    done = true;
                    System.out.println("Good job!");
                }
                else{
                    thrash = in.nextLine();
                    System.out.println("Entered a valued number, not"+thrash);

                }
            }
            else{
                System.out.println("You must enter a valued number");
            }


        }while(!done);
        System.out.println("You entered "+favNum);

    }
}
