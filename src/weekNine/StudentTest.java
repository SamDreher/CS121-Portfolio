package weekNine;

public class StudentTest {
    public static void main(String[] args) {
        // Create an instance of Student Class
        Student studentOne = new Student("Jane Smith", "Spanish", 1234, 2024, 4.0);

        // Display content using getter methods
        System.out.println("Student Name: " + studentOne.getStudentName());
        System.out.println("Major: " + studentOne.getMajor());
        System.out.println("Student ID " + studentOne.getStudentId());
        System.out.println("Year: " + studentOne.getYear());
        System.out.println("GPA: " + studentOne.getGPA());

        // Update object data
        studentOne.setMajor("Computer Science");
        studentOne.setGPA(3.9);

        System.out.println("\nUpdated information using setter methods");
        System.out.println("Major: " + studentOne.getMajor());
        System.out.println("GPA: " + studentOne.getGPA());
    }
}
