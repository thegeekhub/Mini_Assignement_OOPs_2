package mini_assignment_2;

public class Fraction {
    private int num;
    private int den;

    // Constructor with two parameters
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.num = numerator;
        this.den = denominator;
    }

    // Constructor with one parameter (default denominator is 1)
    public Fraction(int numerator) {
        this(numerator, 1);
    }

    // Default constructor (default numerator is 0, default denominator is 1)
    public Fraction() {
        this(0, 1);
    }

    // Method to display the fractional value
    public void displayFractionalValue() {
        System.out.println(num + "/" + den);
    }

    public static void main(String[] args) {
        // Initializing objects using different constructors
        Fraction fraction1 = new Fraction(1, 2);  
        Fraction fraction2 = new Fraction(3);     
        Fraction fraction3 = new Fraction();      

        // Displaying fractional values
        System.out.print("Fraction 1: ");
        fraction1.displayFractionalValue();
        
        System.out.print("Fraction 2: ");
        fraction2.displayFractionalValue();
        
        System.out.print("Fraction 3: ");
        fraction3.displayFractionalValue();
    }
}
