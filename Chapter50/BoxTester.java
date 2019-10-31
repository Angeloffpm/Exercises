public class BoxTester {

    public static void main(String[] args) {
        
        Box box1 = new Box(5.0);
        Box box2 = new Box(2.0, 3.0, 4.0);

        System.out.println("Area of Box1: " + box1.area(box1.getWidth(), box1.getHeight(), box1.getLength()));
        System.out.println("Volume of Box2: " + box2.volume(box2.getWidth(), box2.getHeight(), box2.getLength()));

    }

}