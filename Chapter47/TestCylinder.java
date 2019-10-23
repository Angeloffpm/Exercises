public class TestCylinder {

    public static void main(String[] args) {
        
        Cylinder cylinder1 = new Cylinder(20.5, 105.2);

        System.out.println(cylinder1.area(cylinder1.getRadius(),cylinder1.getHeight()));
        System.out.println(cylinder1.volume(cylinder1.getRadius(),cylinder1.getHeight()));
        
        cylinder1.setRadius(32.5);
        cylinder1.setHeight(70.6);
        
        System.out.println(cylinder1.area(cylinder1.getRadius(),cylinder1.getHeight()));
        System.out.println(cylinder1.volume(cylinder1.getRadius(),cylinder1.getHeight()));

    }

}