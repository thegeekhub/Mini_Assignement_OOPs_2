package mini_assignment_oops2_5;

public class Main {
    public static void main(String[] args) {
        Box3D box3D = new Box3D(5.0, 3.0, 2.0);
        System.out.println("Dimensions: Length = " + box3D.calculateArea() + ", Breadth = " + box3D.calculateArea() + ", Height = " + box3D.calculateArea());
        System.out.println("Surface Area = " + box3D.calculateArea());
        System.out.println("Volume = " + box3D.calculateVolume());
    }
}
