/**
 *
 * @author huaki
 */
import java.util.Scanner;

public class M3E2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double productPrice;
        int quantity;
        double subtotal;
        double vat;
        double total;
        
        System.out.println("What's the price of the product? " );
        productPrice = input.nextDouble();
        System.out.println("How Many? " );
        quantity = input.nextInt();

        subtotal = productPrice * quantity;
        vat = subtotal * 0.12;
        total = subtotal + vat;

        System.out.println("Subtotal: PHP " + subtotal);
        System.out.println("VAT: PHP " + vat);
        System.out.println("Total: PHP " + total);

        input.close();
    }
}
