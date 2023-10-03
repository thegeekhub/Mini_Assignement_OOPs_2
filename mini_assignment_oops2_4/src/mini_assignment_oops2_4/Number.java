package mini_assignment_oops2_4;

public class Number {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public boolean isZero() {
        return value == 0;
    }

    public boolean isPositive() {
        return value > 0;
    }

    public boolean isNegative() {
        return value < 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isArmstrong() {
        int n = (int) value;
        int temp = n;
        int sum = 0;
        int digits = (int) Math.log10(n) + 1;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == n;
    }

    public double getFactorial() {
        int n = (int) value;
        if (n < 0) {
            return Double.NaN; // Not a number for negative factorial
        }
        double factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public double getSqrt() {
        return Math.sqrt(value);
    }

    public double getSqr() {
        return value * value;
    }

    public double sumDigits() {
        int n = (int) Math.abs(value);
        double sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public double getReverse() {
        long n = (long) value;
        long reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    public void listFactors() {
        int n = (int) Math.abs(value);
        System.out.print("Factors of " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void dispBinary() {
        long n = (long) value;
        System.out.println("Binary representation of " + n + ": " + Long.toBinaryString(n));
    }
}
