public class UnaryOperator {

    public static void main(String[] args) {

        System.out.println(sqrt.apply(9.3)); // только принимает добл тип
    }

    //method
    public static java.util.function.UnaryOperator<Double> sqrt = x -> Math.sqrt(x);
    double num;
    double result = sqrt.apply(num);

}
