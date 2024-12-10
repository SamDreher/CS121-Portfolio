package weekNine;

public class PersonTest {
    public static void main(String[] args) {
        // Instantiate the Person object
        Person personOne = new Person("John", "Doe", 30, "123 Elm St", 55000.00);
        Person personTwo = new Person("Jane", "Doe", 30, "123 Elm St", 54400.00);

        // Display original information
        personOne.displayPersonContent();
        personTwo.displayPersonContent();

        // Update the public instance field/variables
        personOne.lastName = "DoeA";
        personTwo.lastName = "DoeB";

        // Set new values to the private instant field/variables
        personOne.setAge(34);
        personTwo.setSalary(55000.00);

        // Get values
        System.out.println(personOne.getAddress());
        System.out.println(personOne.getAge());
        System.out.println(personTwo.getSalary());

        // Try to access displayAge() method with an access modifier as private
        // Comment out the code that doesn't work
        // personOne.displayAge();
        // Protect method so we can access it within a package that the class is in
        personOne.displayAddress();
        personOne.displaySalary();

        // Display updated information
        personOne.displayPersonContent();
        personTwo.displayPersonContent();
    }
}
