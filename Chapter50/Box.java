public class Box {

    private double width;
    private double height;
    private double length;

    // Constructors

    public Box(double width, double height, double length) {

        this.width  = width;
        this.height = height;
        this.length = length;

    }

    public Box(double side) {

        this.width  = side;
        this.height = side;
        this.length = side;

    }

    public Box(Box oldBox) {

        this.width  = oldBox.getWidth();
        this.height = oldBox.getHeight();
        this.length = oldBox.getLength();

    }

    public Box biggerBox(Box oldBox) {

        return new Box(1.25 * oldBox.getWidth(), 1.25 * oldBox.getHeight(), 1.25 * getLength());

    }

    public Box smallerBox(Box oldBox) {

        return new Box(0.75 * oldBox.getWidth(), 0.75 * oldBox.getHeight(), 0.75 * getLength());

    }

    // Getters & Setters

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getLength() {
        return this.length;
    }

    private double faceArea() {
        return this.width * this.height;
    }

    private double topArea() {
        return this.width * this.length;
    }

    private double sideArea() {
        return this.length * this.height;
    }

    // Methods

    public double volume(double width, double height, double length) {

        return width * height * length;

    }

    public double area(double width, double height, double length) {

        //return 2 * ((width * length) + (width * height) + (length * height));
        return 2 * (faceArea() + topArea() + sideArea());

    }

    public boolean nests(Box outsideBox) {

        if (outsideBox.getLength() > this.length && outsideBox.getWidth() > this.width && outsideBox.getHeight() > this.height) return true;
        return false;

    }

}