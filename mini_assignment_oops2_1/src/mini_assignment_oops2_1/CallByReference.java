package mini_assignment_oops2_1;

public class CallByReference{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("Before function call: arr[0] = " + arr[0]);
        
        modifyArray(arr);
        
        System.out.println("After function call: arr[0] = " + arr[0]);
    }
    
    public static void modifyArray(int[] arr) {
        arr[0] = 10;
        System.out.println("Inside function: arr[0] = " + arr[0]);
    }
}
