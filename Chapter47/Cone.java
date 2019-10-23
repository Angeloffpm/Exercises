public class Cone {

    private double radius;
    private double height;

    public Cone(double radius, double height) {

        this.radius = radius;
        this.height = height;

    }

    // Functions

    public double area(double radius, double height) {

        return Math.PI * radius * (radius + Math.sqrt((height * height) + (radius * radius)));

    }

    public double volume(double radius, double height) {

        return Math.PI * radius * radius * (height / 3);

    }

    public double slantHeight(double radius, double height) {

        return Math.sqrt((radius * radius) + (height * height));

    }

    public double angle(double radius, double height) {

        return Math.atan(radius / height);

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