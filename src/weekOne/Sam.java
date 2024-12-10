package weekOne;

public class Sam {

    public static void main(String[] args) {
        //Declaring a variable
        int age;
        double gpa;
        char letterGrade;
        boolean csMajor;
        String name;

        //Initialize variables
        age = 1;
        gpa = 3.9;
        letterGrade = 'A';
        csMajor = true;
        name = "Sam";

        String favoriteColor = "Periwinkle";

        //Printing these variables

        //print
        //println
        //printf - formatting
        System.out.printf("The age of this person is: %d%n",age);
        System.out.printf("The gpa is %.2f%n",gpa);
        System.out.printf("The letter grade is: %c%n",letterGrade);
        System.out.printf("Is it true that your major is Computer Science? %b%n",csMajor);
        System.out.printf("This person's name is: %s%n",name);

        System.out.println("Your age is: " + age);

    }
}
