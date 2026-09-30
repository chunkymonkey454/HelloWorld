import java.util.Scanner;
public class TemperatureReadings {
    public static void main(String[] args) {
        double currentReading = 0;
        double totalTemps = 0;
        double avgTemps = 0;
        double numOfReadings = 0;
        String continueYN = "";
        boolean done = false; //control variable
        Scanner in = new Scanner(System.in);
        String thrash = "";

        do {
            System.out.println("Enter the current temperature reading");
            if (in.hasNextDouble()) {
            currentReading=in.nextDouble();
            in.nextLine(); //clear the buffer

            //add to current reading to the total
                totalTemps = totalTemps + currentReading;

                //increment number of readings
                numOfReadings=numOfReadings+1;

                //see if we should continue
                System.out.println("Should we continue? [Y/N]");
                continueYN = in.nextLine();
                if(continueYN.equalsIgnoreCase("N")){
             done = true; //leave the loop
                }
            }
            else {
                thrash = in.nextLine();
                System.out.println("You must enter a valid temperature");
            }

        }while(!done);

        //now compute the average
        avgTemps = totalTemps/ numOfReadings;
        System.out.println("The average temperature is "+avgTemps);
        System.out.println("The number of readings "+numOfReadings);
        System.out.println("The total temperature of readings is "+totalTemps);
    }
}