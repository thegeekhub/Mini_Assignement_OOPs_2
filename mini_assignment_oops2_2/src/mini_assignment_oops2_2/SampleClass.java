package mini_assignment_oops2_2;


public class SampleClass extends Debuggable {
 private String data;

 public SampleClass(String data) {
     this.data = data;
 }

 @Override
 public void debugInfo() {
     System.out.println("Debug Info: " + data);
 }

 @Override
 public void debugError(String errorMessage) {
     System.err.println("Debug Error: " + errorMessage);
 }
}

