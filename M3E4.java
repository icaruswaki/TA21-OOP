/**
 *
 * @author huaki
 */
import java.util.Scanner;
public class M3E4 {

     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight;
        double height;
        double bmi;
        
        System.out.println("How much do you weigh? ");
        weight = input.nextDouble();
        System.out.println("What's your height? ");
        height = input.nextDouble();

        bmi = weight / (height * height);

        System.out.println("BMI: approximately " + bmi);

        input.close();
    }
}
