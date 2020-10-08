package Lab7;

public class Main
{
    public static void main(String[] args)
    {
        FibonacciCalculator calculator = new FibonacciCalculator();
        int fib5 = calculator.calculateFibonacci(5);
        System.out.println("Fib(5) is " + fib5);
    }
}
