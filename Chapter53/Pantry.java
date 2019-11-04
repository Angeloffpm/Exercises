public class Pantry {

    private Jam jar1;
    private Jam jar2;
    private Jam jar3;
    private Jam selected;

    // Constructors

    public Pantry(Jam jar1, Jam jar2, Jam jar3) {

        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = jar3;
        selected = null;

    }

    public Pantry(Jam jar1, Jam jar2) {

        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = null;
        selected = null; 

    }

    public Pantry(Jam jar1){

        this.jar1 = jar1;
        this.jar2 = null;
        this.jar3 = null;
        selected = null;

    }

    // Methods

    public String toString() {
        String str = "";
        str += "1: " + jar1.toString() + "\n";
        if (jar2 != null) {
            str += "2: " + jar2.toString() + "\n";
        }
        if (jar3 != null) {
            str += "3: " + jar3.toString() + "\n";
        }
        return str;
    }

    public boolean select(int jarNumber) {
        if (jarNumber == 1) {
            selected = jar1;
            return true;
        } else if (jarNumber == 2 & jar2 != null) {
            selected = jar2;
            return true;
        } else if (jarNumber == 3 & jar3 != null) {
            selected = jar3;
            return true;
        } else {
            System.out.println("Invalid selection. Selection was not changed.");
            return false;
        }
    }

    public void spread(int oz) {
        selected.spread(oz);
    }

}