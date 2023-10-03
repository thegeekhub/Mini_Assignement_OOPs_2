package mini_assignment_oops2_4;

public class Main {
    public static void main(String[] args) {
        Number num = new Number(5.0);
        System.out.println("Is Prime: " + num.isPrime());
        System.out.println("Factorial: " + num.getFactorial());
        System.out.println("Square Root: " + num.getSqrt());
        num.listFactors();
        num.dispBinary();
    }
}
