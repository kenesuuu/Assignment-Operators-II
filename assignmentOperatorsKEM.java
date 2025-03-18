public class assignmentOperatorsKEM {
    public static void main(String[] args) {
        // Part 1: Assignment Operators
        int x = 10;
        System.out.println("Initial value of x: " + x);

        x += 5;  // Add 5 to x
        System.out.println("After adding 5: " + x);

        x -= 3;  // Subtract 3 from x
        System.out.println("After subtracting 3: " + x);

        x *= 2;  // Multiply x by 2
        System.out.println("After multiplying by 2: " + x);

        x /= 4;  // Divide x by 4
        System.out.println("After dividing by 4: " + x);

        x %= 3;  // Remainder when x is divided by 3
        System.out.println("After modulus by 3: " + x);

        // Part 2: Final Price Calculation
        double initialPrice = 100.0;
        System.out.println("\nInitial product price: $" + initialPrice);

        initialPrice *= 0.80; // Apply 20% discount
        System.out.println("After 20% discount: $" + initialPrice);

        initialPrice *= 1.10; // Add 10% tax
        System.out.println("After adding 10% tax: $" + initialPrice);
    }
}
