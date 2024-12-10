package weekNine;

public class Student {
    // Define the instance field/variables/class/member variables
    // 5
    private String studentName;
    private String major;
    private int studentId;
    private int year;
    private double gpa;

    // Constructor
    // Initialize the instance variables
    public Student(String Name, String Major, int ID, int Year, double GPA) {
        this.studentName = Name;
        this.major = Major;
        this.studentId = ID;
        this.year = Year;
        this.gpa = GPA;
    }

    // Setters (Mutators)
    public void setStudentName(String Name) {
        this.studentName = Name;
    }
    public void setMajor(String Major) {
        this.major = Major;
    }
    public void setStudentId(int ID) {
        this.studentId = ID;
    }
    public void setYear(int Year) {
        this.year = Year;
    }
    public void setGPA(double GPA) {
        this.gpa = GPA;
    }

    // Getters (Accessors)
    public String getStudentName() {
        return studentName;
    }
    public String getMajor() {
        return major;
    }
    public int getStudentId() {
        return studentId;
    }
    public int getYear() {
        return year;
    }
    public double getGPA() {
        return gpa;
    }
}
