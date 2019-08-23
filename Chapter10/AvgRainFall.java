public class AvgRainFall {
    public static void main(String[] args) {
        double april = 12.0;
        double may   = 14.0;
        double june  = 8.0;
        double avg   = (april + may + june) / 3;
        System.out.println("Rainfall for April: \t" + april);
        System.out.println("Rainfall for May: \t" + may);
        System.out.println("Rainfall for June: \t" + june);
        System.out.println("Average Rainfall: \t" + avg);
    }
}