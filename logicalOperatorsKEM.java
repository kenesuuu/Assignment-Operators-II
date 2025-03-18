import java.util.Scanner;

public class logicalOperatorsKEM {
    public static void main(String[] args) {
        // Logical Operators Demonstration
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b)); // Logical AND
        System.out.println("a || b: " + (a || b)); // Logical OR
        System.out.println("!a: " + (!a));          // Logical NOT (a)
        System.out.println("!b: " + (!b));          // Logical NOT (b)

        // Loan Eligibility Check
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter credit score: ");
        int creditScore = scanner.nextInt();

        System.out.print("Enter annual income: ");
        double annualIncome = scanner.nextDouble();

        // Loan Eligibility Logic
        if (creditScore > 700 && annualIncome > 50000) {
            System.out.println("You are eligible for a loan.");
        } else {
            System.out.println("Sorry, you are not eligible for a loan.");
        }

        scanner.close();
    }
}
