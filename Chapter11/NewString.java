public class NewString {
    public static void main(String[] args) {
        String first = new String("           In a Hole         in the ground there lived a Hobbit.      ");
        String second;
        second = first.trim();
        System.out.println(first);
        System.out.println(second);
    }
}