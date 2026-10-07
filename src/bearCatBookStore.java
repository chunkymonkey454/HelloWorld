import java.util.Scanner;

public class bearCatBookStore {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Get purchase details
        System.out.print("Enter number of textbooks: ");
        int textbooks = in.nextInt();

        System.out.print("Enter price per textbook ($): ");
        double bookPrice = in.nextDouble();

        System.out.print("Enter number of supply kits: ");
        int supplyKits = in.nextInt();

        System.out.print("Enter price per supply kit ($): ");
        double kitPrice = in.nextDouble();

        System.out.print("Are you a UC student? (yes/no): ");
        String isStudent = in.next();

        // Calculate subtotals
        double bookSubtotal = textbooks * bookPrice;
        double kitSubtotal  = supplyKits * kitPrice;
        double subtotal     = bookSubtotal + kitSubtotal;

        // Apply UC student discount (15% off if student)
        double discount = 0;
        if (isStudent.equals("yes")) {                              // Line K
            discount = subtotal * 0.15;
        }

        double afterDiscount = subtotal - discount;

        // Apply sales tax (7.8% in Cincinnati)
        double tax   = afterDiscount * 7.8;                   // Line L
        double total = afterDiscount + tax;

        // Split among group members
        System.out.print("How many people are splitting the cost? ");
        int groupSize = in.nextInt();

        double perPerson = total / groupSize;                  // Line M

        // Output
        System.out.println("=== Bearcat Bookstore Receipt ===");
        System.out.println("Book subtotal:    $" + bookSubtotal);
        System.out.println("Kit subtotal:     $" + kitSubtotal);
        System.out.println("Subtotal:         $" + subtotal);
        System.out.println("Student discount: $" + discount);
        System.out.println("After discount:   $" + afterDiscount);
        System.out.println("Sales tax:        $" + tax);
        System.out.println("Total:            $" + total);
        System.out.println("Per person:       $" + perPerson);
    }
}
