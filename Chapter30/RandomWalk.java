import java.util.Random;

public class RandomWalk {
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        double x = 0; double y = 0;

        int iterations = rand.nextInt(10000);

        for (int i = 0; i < iterations; i++) {

            x += rand.nextDouble() * 2.0 - 1.0;
            y += rand.nextDouble() * 2.0 - 1.0;

        }

        double distance = Math.sqrt((x*x) + (y*y));

        System.out.println("The ant traveled " + distance + " away to (" + x + ", " + y + ") in " + iterations + " iterations");

    }
}