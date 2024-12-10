package weekNine;

public class Person {
    // Two public instance fields/variables/member variables
    // Public: Means that a variable or method can be accessed anywhere
    //         in the program as long as there is an instance of the class to call it from
    //         Person personOne = new Person(x, y, z, a, b);
    //         Person personTwo = new Person(x, y, z, a, b);
    //         PersonOne.firstName
    //         PersonOne.lastName
    //         personOne.age ---> ??
    public String firstName;
    public String lastName;

    // Three private instance fields/variables
    // Private: Means that the variable or method can only be accessed inside of the class
    private int age;
    private String address;
    private double salary;

    // Constructor: Parameterized constructor
    // Take in 5 parameters
    // Member variables
    public Person(String FirstName, String LastName, int Age, String Address, double Salary) {
        this.firstName = FirstName;
        this.lastName = LastName;
        this.age = Age;
        this.address = Address;
        this.salary = Salary;
    }
    // Access Modifier: Public
    public void displayPersonContent() {
        System.out.printf("\nFull Name: %s %s\nAge:%d\nAddress:%s\nSalary:%.2f\n", firstName, lastName, age, address, salary);
    }
    // Access Modifier: Private
    private void displayAge() {
        System.out.println("Age" + age);
    }
    // Access Modifier: Protected
    // Protected: Means members can only be accessed inside of the class,
    //            any class that is inside of its package, and any of the class's subclasses (Inheritance)
    protected void displayAddress() {
        System.out.println("Address" + address);
    }
    // Access Modifier: Default
    // Default: Means access has no keyword and only
    //          allowed to access within the package the class is in
    //          "Package - Private == default"
    void displaySalary() {
        System.out.println("Salary" + salary);
    }
    // OOP Concept: #1 Encapsulation
    // SETTERS (Mutators) AND GETTERS (Accessors)
    /*
        private int age;
        private String address;
        private double salary;
     */
    // Setters (Mutators)
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Getters (Accessors)
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public double getSalary() {
        return salary;
    }
}