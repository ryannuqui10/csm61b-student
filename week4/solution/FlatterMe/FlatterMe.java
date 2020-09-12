public class FlatterMe {
    public int[] a = new int[3];
    public int[] b = new int[]{1, 2, 3};
    public int[] c = {1,2,3};

    /*
        Implement middle, which takes in int[] and returns the middle element. If
        no element is in the exact middle, return the element to the left middle.
        You can assume that the input is non-null and contains at least one element.
     */
    public static int middle(int[] data) {
        int midIndex = (data.length - 1) / 2;
        return data[midIndex];
    }

    /*
        Implement flatten, which takes in a int[][] and returns an int[] that contains
        all of the arrays in data concatenated together.
     */
    public static int[] flatten(int[][] data) {
        int size = 0;
        for (int[] row : data) {
            size += row.length;
        }
        int [] result = new int[size];
        int i = 0;
        for (int[] row : data) {
            for (int value : row) {
                result[i] = value;
                i += 1;
            }
        }
        return result;
    }
}
