public class NumericOperations {


//    Addition of an int and a double.
    public static void sum(int a, double b) {
        System.out.println("sum: " + (a + b) + " " + ((Object)(a + b)).getClass().getSimpleName());
    }

//    Subtraction of a float from an int.
    public static void subtraction(int a, float b) {
        System.out.println("subtraction: " + (a - b) + " " + ((Object)(a - b)).getClass().getSimpleName());
    }

//    Multiplication of a short and a long.
public static void multiplication(short a, long b) {
    System.out.println("multiplication: " + (a * b) + " " + ((Object)(a * b)).getClass().getSimpleName());
}

//    Division of double and int.
public static void division(double a, int b) {
    System.out.println("division: " + (a / b) + " " + ((Object)(a / b)).getClass().getSimpleName());
}

}
