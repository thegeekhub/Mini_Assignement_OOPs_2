package mini_assignment_oops2_1;

public class CallByValue {

	public static void main(String[] args) {
	        int value = 5;
	        System.out.println("Before function call: value = " + value);
	        
	        modifyValue(value);
	        
	        System.out.println("After function call: value = " + value);
	    }
	    
	    public static void modifyValue(int x) {
	        x = x + 10;
	        System.out.println("Inside function: x = " + x);
	    }
	}