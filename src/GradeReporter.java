import java.util.Scanner;

public class GradeReporter {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("Enter student name: ");
            String name = in.nextLine();

            System.out.print("Enter score 1: ");
            int score1 = in.nextInt();

            System.out.print("Enter score 2: ");
            int score2 = in.nextInt();

            System.out.print("Enter score 3: ");
            int score3 = in.nextInt();

            // Find highest score
            int highest = Math.max(score1, Math.max(score2, score3));  // Line A

            // Find lowest score
            int lowest = Math.min(score1, Math.min(score2, score3));

            // Calculate average (integer division bug)
            double average = (score1 + score2 + score3) / 3;             // Line B

            // Calculate range
            int range = highest - lowest;

            System.out.println("=== Grade Report for " + name + " ===");
            System.out.println("Highest score: " + highest);
            System.out.println("Lowest score:  " + lowest);
            System.out.println("Average score: " + average);
            System.out.println("Score range:   " + range);

            // Grade classification
            if (average >= 90) {
                System.out.println("Grade: A — Excellent work, " + name + "!");
            } else if (average >= 80) {
                System.out.println("Grade: B — Good job, " + name + "!");  // Line C
            System.out.println("Keep pushing for that A!");             // Line D
        } else if (average >= 70) {
            System.out.println("Grade: C — You can do better, " + name + "!");
        } else {
            System.out.println("Grade: F — Please see your advisor, "+ name + ".");
        }
    }
}

