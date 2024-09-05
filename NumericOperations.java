public class NumericOperations {


    public double add(int primitiveInt, double primitiveDouble) {
        if (primitiveInt < 0 || primitiveDouble < 0) {
            System.out.println("Warning: Adding negative numbers.");
        }
        return primitiveInt + primitiveDouble;
    }

    public float subtract(float primitiveFloat, int primitiveInt) {
        return primitiveInt - primitiveFloat;
    }

    public long multiply(short primitiveShort, long primitiveLong) {
        long result = primitiveShort * primitiveLong;
        if (result / primitiveLong != primitiveShort) {
            System.out.println("Error: Multiplication overflow.");
            return Long.MAX_VALUE;
        }
        return result;
    }

    public double divide(double primitiveDouble, int primitiveInt) {
        if (primitiveInt == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return primitiveDouble / primitiveInt;
    }

}
