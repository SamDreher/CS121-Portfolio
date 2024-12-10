package weekFourteen;

public class StudentSearch {
    public static void main(String[] args) {
        // Big O
        // What is Big O?
        // Describes the performance or complexity of an algorithm

        // What is the maximum amount of time or space that your algorithm takes
        // Time Complexity - The time it takes to run as function of the size of the input data
        // Space Complexity - The space it requires
        printOneTime("Billy");

        // Array of 26 students
        String[] students = {"Alice", "Bob", "Charlie", "David", "Ella", "Frank", "Grace", "Hannah",
                "Ian", "Jack", "Katie", "Luke", "Mona", "Nate", "Olivia", "Paul", "Quinn", "Rachel",
                "Steve", "Tina", "Uma", "Victor", "Wendy", "Xander", "Yara", "Zane"};

        // 26 Students --> Maximum of 5 Comparisons
        // log n
        // 2 ^ 5 = 32
        // 2 ^ 4 = 16
        int index = binarySearch(students, "Nate"); // Looking for Nate
        if(index != -1) {
            System.out.println("Nate is found at index " + index);
        } else {
            System.out.println("Nate is not found in this array");
        }

        // Call linear method
        printNTimes(students);

    }
    // 0(1) - Constant Time --> Doesn't change based off of increasing input
    public static void printOneTime(String name) {
        System.out.println(name);

    }
    // O(n) - Linear Time - Execution grows linearly with the input size
    public static void printNTimes(String[] array) {
        for(String name: array) {
            System.out.println(name);
        }

    }
    // O(log n) - Logarithmic Time - The execution time grows logarithmically with the input size
    public static int binarySearch(String [] array, String value) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = value.compareTo(array[mid]);

            if (result == 0) {
                return mid; // Value found
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Value not found
    }
}