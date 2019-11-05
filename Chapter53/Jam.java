public class Jam {

    private String contents;
    private String date;
    private int    capacity;

    // Constructors

    public Jam(String contents, String date, int capacity) {

        this.contents = contents;
        this.date = date;
        this.capacity = capacity;

    }

    // Methods

    public boolean empty() {

        return (capacity == 0);

    }

    public String toString() {

        return contents + "   " + date + "   " + capacity + " fl. oz.";

    }

    public void spread(int fluidOz) {

        if (!empty()) {
            System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents);
            if (fluidOz <= capacity) {
                capacity = capacity - fluidOz;
            } else {
                capacity = 0;
            }
        } else {
            System.out.println("No jam in the Jar!");
        }

    }

    // Getters & Setters

    public int getCapacity() {
        return this.capacity;
    }

    public String getDate() {
        return this.date;
    }

}