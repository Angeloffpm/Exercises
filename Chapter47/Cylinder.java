public class Cylinder {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {

        this.radius = radius;
        this.height = height;

    }

    // Functions

    public double area(double radius, double height) {

        return (2 * (Math.PI * radius * radius)) + (2 * Math.PI * radius * height);

    }

    public double volume(double radius, double height) {

        return (Math.PI * radius * radius * height);

    }

    // Getters & Setters

    public double getRadius() {
        return this.radius;
    }

    public double getHeight() {
        return this.height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}