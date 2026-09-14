public class SalesTax {
    public static void main(String[] args) {
        double itemPrice = 8.0;
        final double TAX_RATE = 0.05;
        double salesTax = itemPrice * TAX_RATE;
        System.out.println("The sales tax for " + itemPrice + " is " + salesTax);
    }

}