import java.util.Arrays;

public class Weight {

    private int[] data;

    public Weight(int[] init) {

        data = new int[init.length];

        for (int i = 0; i < init.length; i++) {

            data[i] = init[i];

        }

    }

    public int average() {

        int sum = 0;
        int count = this.data.length;

        for (int i = 0; i < count; i++) {
            sum += this.data[i];
        }

        return sum / count;

    }

    public int subAverage(int start, int end) {

        int sum = 0;
        int count = end + 1 - start;

        for (int i = start; i <= end; i++) {
            sum += this.data[i];
        }

        return sum / count;

    }

    public String toString() {
        return Arrays.toString(data);
    }

}