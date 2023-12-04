/***************************************************
 File: Proj11runner.java
 Author: Fred Butoma
 Purpose: Proj11Runner.java is a class that uses
            lambda expressions to perform arithmetic
            functions on numbers from the command line
 ***************************************************/
public class Proj11Runner {
    //Constructor 
    public Proj11Runner() {
        // Print the certification statement
        System.out.println("I certify that this program is my own work\n" +
                "and is not the work of others. I agree not\n" +
                "to share my solution with others.\n" +
                "Fred Butoma");

    }

    public double[] run(int x, int y) {
        // Lambda expressions for each arithmetic operation
        ArithmeticOperation sum = (a, b) -> a + b;
        ArithmeticOperation difference = (a, b) -> a - b;
        ArithmeticOperation product = (a, b) -> a * b;
        ArithmeticOperation quotient = (a, b) -> b != 0 ? (double) a / b : 0;

        // Perform operations and store results in an array
        double[] results = new double[4];
        results[0] = sum.operate(x, y);
        results[1] = difference.operate(x, y);
        results[2] = product.operate(x, y);
        results[3] = quotient.operate(x, y);

        return results;
    }

    // Functional interface for arithmetic operations
    @FunctionalInterface
    interface ArithmeticOperation {
        double operate(int a, int b);
    }
}

