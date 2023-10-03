package mini_assignment_oops2_5;

class Box {
    private double length;
    private double breadth;
    private double height;

    // Constructor for Box
    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Method to set the dimensions of the box
    public void setDimensions(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Method to calculate and return the surface area of the box
    public double calculateArea() {
        return 2 * (length * breadth + length * height + breadth * height);
    }

    // Method to calculate and return the volume of the box
    public double calculateVolume() {
        return length * breadth * height;
    }
}

class Box3D extends Box {
    // Constructor for Box3D, extends Box
    public Box3D(double length, double breadth, double height) {
        super(length, breadth, height);
    }
}


