public class TestCone {

    public static void main(String[] args) {
        
        Cone cone1 = new Cone(5.0, 10.0);
        Cone cone2 = new Cone(12.5, 8.5);

        System.out.println(cone1.slantHeight(cone1.getRadius(), cone1.getHeight()));
        System.out.println(cone1.volume(cone1.getRadius(), cone1.getHeight()));

        cone1.setRadius(40.0);

        System.out.println(cone1.volume(cone1.getRadius(), cone1.getHeight()));

    }

}