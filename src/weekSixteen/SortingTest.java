package weekSixteen;

public class SortingTest {
    public static void main(String[] args) {
        // Create an instance of the Sorting class
        // so that we can run the public methods from it
        Sorting sorter = new Sorting();

        int [] array3 = {3, 6, 2, 9, 0, 13, 34, 23, 10, 32, 27};
        sorter.mergeSort(array3);
        printArray(array3);
    }

    // Static method to print an array
    // Static means we don't have to create an instance
    // of this class to call the method
    public static void printArray(int[] array) {
        for (int num: array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
