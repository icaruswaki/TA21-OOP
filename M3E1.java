import java.util.Scanner;
public class M3E1 {

        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double hoursWorked;
        double hourlyRate;
        double grossSalary;
        
        System.out.println("Salary Calculator" );
        System.out.print("\n");
        System.out.println("How many hours did you work? ");
        hoursWorked = input.nextDouble();
        System.out.println("How much is your hourly pay? ");
        hourlyRate = input.nextDouble();

        grossSalary = hoursWorked * hourlyRate;
        
        
        System.out.println("Gross Salary: PHP " + grossSalary);

        input.close();
    }
}
