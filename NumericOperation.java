public class NumericOperation {

    static void addition(int a, double b){
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println("int + double = double");
    }

    static void subtraction(int a, float b){
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println("int - float = float");    }

    static void multiplication(short a, long b){
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println("short * long = long");    }

    static void division(double a, int b) {

        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println("double / int = double");    }
}
