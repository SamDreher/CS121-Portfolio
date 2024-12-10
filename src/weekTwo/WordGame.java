package weekTwo;

import javax.swing.*;
import javax.swing.JOptionPane;

public class WordGame {
    // main + tab
    public static void main(String[] args) {
        String name;
        String age;
        String city;
        String college;
        String major;
        String animal;
        String petName;

        // Prompt the user
        name = JOptionPane.showInputDialog("Enter in your name: ");
        city = JOptionPane.showInputDialog("Enter in your city: ");
        age = JOptionPane.showInputDialog("Enter in your age: ");
        college = JOptionPane.showInputDialog("Enter in your college: ");
        major = JOptionPane.showInputDialog("Enter in your major: ");
        animal = JOptionPane.showInputDialog("Enter in an animal: ");
        petName = JOptionPane.showInputDialog("Enter in a pet name");


        // String.format() --> generate a message
        // Storing the message in a formatted way in the variable message
        String message = String.format("There once was a person named %s who lived in %s. " +
                "At the age of %s, %s went to college at %s. " +
                "%s graduated with a major in %s. " +
                "Then, %s adopted a %s named %s. " +
                "They both lived happily ever after! ",name,city,age,name,college,name,major,name,animal,petName);

        // Display message in dialog box
        JOptionPane.showMessageDialog(null,message);
    }
}
