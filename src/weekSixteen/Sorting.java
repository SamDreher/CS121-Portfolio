package weekSixteen;

public class Sorting {
    public void mergeSort (int[] array) {
        // If array has 1 element, return:
        // Base case: Stops recursive call -- mergeSort method stops
        if (array.length <= 1) {
            return; // A method will stop when it reaches a return statement
        }
        // Initialize array with size of left half the original array
        int[] leftHalf = new int[array.length / 2];
        // Initialize array with size of right half the original array
        int[] rightHalf = new int[array.length - leftHalf.length];

        // Assigning values from the left half of original array to leftHalf array
        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = array[i];
        }

        // Assigning values from second half of original array to secondHalf array
        for (int i = 0; i < rightHalf.length; i++) {
            rightHalf[i] = array[leftHalf.length + i];
        }

        // Recursive call until arrays reach base case: 1 element
        mergeSort(leftHalf); // Recursive call: Divides leftHalf array into smaller arrays
        mergeSort(rightHalf); // Recursive call: Divides rightHalf array into smaller arrays

        // Call merge method to merge the divided arrays
        merge(leftHalf, rightHalf, array);
    }

    private void merge(int[] leftHalf, int[] rightHalf, int[] array) {
        int leftIndex = 0;
        int rightIndex = 0;
        int arrayIndex = 0;

        // Advance leftHalf array index or rightHalf array index accordingly
        while ((leftIndex < leftHalf.length) && (rightIndex < rightHalf.length)) {
            if (leftHalf[leftIndex] < rightHalf[rightIndex]) {
                array[arrayIndex] = leftHalf[leftIndex];
                leftIndex++;
                arrayIndex++;
            } else {
                array[arrayIndex] = rightHalf[rightIndex];
                rightIndex++;
                arrayIndex++;
            }
        }

        // Copy the rest of leftHalf array to original array
        while (leftIndex < leftHalf.length) {
            array[arrayIndex] = leftHalf[leftIndex];
            arrayIndex++;
            leftIndex++;
        }

        // Copy the rest of rightHalf array to original array
        // Note only one of these while loops will be true
        while (rightIndex < rightHalf.length) {
            array[arrayIndex] = rightHalf[rightIndex];
            arrayIndex++;
            rightIndex++;
        }
    }
}
