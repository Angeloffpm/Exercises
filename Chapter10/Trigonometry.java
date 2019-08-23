public class Trigonometry {
    public static void main(String[] args) {
        double x = 30 * Math.PI/180;
        double sine = Math.sin(x);
        double cosine = Math.cos(x);
        double squares = (sine * sine) + (cosine * cosine);
        System.out.println("sine: " + sine + " cosine: " + cosine + " sum of squares: " + squares);
    }
}