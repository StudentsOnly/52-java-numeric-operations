public class NumericOperations {

    public static void main(String[] args) {

        try {
            // Addition
            int intValue = 10;
            double doubleValue = 5.5;
            double additionResult = intValue + doubleValue;
            System.out.println("Addition of int and double: " + additionResult + " (Data type: " + ((Object)additionResult).getClass().getSimpleName() + ")");

            // Subtraction
            float floatValue = 12.3f;
            int intValue2 = 20;
            float subtractionResult = intValue2 - floatValue;
            System.out.println("Subtraction of float from int: " + subtractionResult + " (Data type: " + ((Object)subtractionResult).getClass().getSimpleName() + ")");

            // Multiplication
            short shortValue = 3;
            long longValue = 100000L;
            long multiplicationResult = shortValue * longValue;
            System.out.println("Multiplication of short and long: " + multiplicationResult + " (Data type: " + ((Object)multiplicationResult).getClass().getSimpleName() + ")");

            // Division
            double doubleValue2 = 25.5;
            int intValue3 = 4;
            double divisionResult = doubleValue2 / intValue3;
            System.out.println("Division of double by int: " + divisionResult + " (Data type: " + ((Object)divisionResult).getClass().getSimpleName() + ")");

        } catch (ArithmeticException e) {
            System.out.println("An arithmetic error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
