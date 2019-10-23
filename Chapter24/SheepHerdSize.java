public class SheepHerdSize {
    public static void main(String[] args) {
        

        double n = 20.0;
        double power = 1.0;
        boolean supervision = true;
        int safeyear = 0;

        for (int t = 0; t <= 25; t++) {

            n = 220 / (1 + (10 * power));
            power *= 0.83;

            if (supervision && n > 80.0) {
                supervision = false;
                safeyear = t;
            }

            System.out.println("Year " + t + ": " + n);
        
        }


        System.out.println("Supervision can stop after " + (safeyear - 1) + " years." );
        
    }
}