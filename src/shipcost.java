import java.util.Scanner;
public class shipcost {
    public static void main(String[] args) {
        double cost = 0;
        double taxRate =0.02;
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the price of your item");
         cost = in.nextInt();

if(cost >=100){

    double salesTax = cost * taxRate;
    double totalCost = salesTax + cost;
    System.out.println("The price of your item is "+totalCost);
    }
else System.out.println("The price of your item is " +cost);

    }
}





