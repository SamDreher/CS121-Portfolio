package weekTwelve;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        // Syntax: try{}catch(){}
        try {
            // Create an instance
            FileWriter fileWriter = new FileWriter("TestingFileWrite.txt", true);
            PrintWriter output  = new PrintWriter(fileWriter);
            // Declare Variables
            String name = JOptionPane.showInputDialog("Enter the user's name: ");
            String passWord = JOptionPane.showInputDialog("Enter the user's password: ");
            String playerCharacter = JOptionPane.showInputDialog("Enter the user's player character: ");
            int score = Integer.parseInt(JOptionPane.showInputDialog("Enter the user's score: "));
            double winningPercent = Double.parseDouble(JOptionPane.showInputDialog("Enter the user's winning percentage: "));

            output.printf("%n%-20s %-20s %6d %23s %15.2f", name, passWord, score, playerCharacter, winningPercent);

            fileWriter.close();
            output.close();

        } catch(FileNotFoundException e) {
            System.err.println("**** Your File wasn't found");
        }
    }
}
