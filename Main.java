public class Main {

    public static void main(String[] args) {

        NumericOperations calculator = new NumericOperations();

        double addition = calculator.add(2, 1.45);
        System.out.println("Addition of an int and a double: " + addition);

        double additionNegative = calculator.add(-2, -1.45);
        System.out.println("Addition of an negative int and a negative double: " + additionNegative);

        float subtraction = calculator.subtract(23f, 32);
        System.out.println("Subtraction of a float from an int: " + subtraction);

        long multiplication = calculator.multiply((short) 10, 234L);
        System.out.println("Multiplication of a short and a long: " + multiplication);

        double division = calculator.divide(203.67, 32);
        System.out.println("Division of double and int: " + division);

        // Testing edge cases
        calculator.divide(203.67, 0);  // Division by zero
        calculator.multiply(Short.MAX_VALUE, Long.MAX_VALUE);  // Multiplication overflow

    }

}
