import java.util.Scanner;
public class partyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Republican = "R";
        String Democrat = "D";
        String Independent = "I";
        String Other = "Other";
        String input = "";
        System.out.println("What is your political affiliation? (D,R,I,Other)");
        input = in.nextLine();
        if (input.equals("R")) {
            System.out.println("You are a Republican Elephant!");
        } else if (input.equals("D")) {
            System.out.println("You are a Democrat Donkey!");
        } else if (input.equals("I")) {
            System.out.println("You are an Independent!");
        } else if (input.equals("Other")) {
            System.out.println("You are something else entirely!");
        } else {
            System.out.println("Please choose one of the given options");
        }
    }
}