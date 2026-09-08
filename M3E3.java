/**
 *
 * @author huaki
 */
import java.util.Scanner;
public class M3E3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.println("Temperature in Celsius (coverting to Fahrenheit): " );
        celsius = input.nextDouble();

        fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Fahrenheit: " + fahrenheit);

        input.close();
    }
}
