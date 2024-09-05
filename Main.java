class NumericOperations {
    int i = 10;
    double d = 2.5d;
    float f = 1.2f;
    short s = 1;
    long l = 100;

    public double addition() {
        return i + d;
    }

    public float substract() {
        return i - f;
    }

    public long multiply() {
        return s * l;
    }

    public double divide() {
        return i / d;
    }

}

public class Main {
    public static void main(String[] args) {
        NumericOperations op = new NumericOperations();
        System.out.println(op.addition());
        System.out.println(op.substract());
        System.out.println(op.multiply());
        System.out.println(op.divide());
    }
}
