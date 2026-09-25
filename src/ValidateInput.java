import java.util.Scanner;
public class ValidateInput {
   public static void main(String [] args){
       int age = 0;
       Scanner in= new Scanner(System.in);
       System.out.println("How old are you?");
       //first check if user enters and integer
       if(in.hasNextInt()) {
           age = in.nextInt();
       }
       else{
           System.out.println("Sorry you must enter an integer");
       }




   }
}
