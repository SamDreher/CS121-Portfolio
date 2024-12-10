package weekFive;

import javax.swing.*;

public class TestAverage {
    public static void main(String[] args) {
        int numStudents;
        int numTests;
        int testScore;
        int totalScores = 0;
        double averageScore;

        numStudents = Integer.parseInt(JOptionPane.showInputDialog("How many students would you like to enter?"));
        numTests = Integer.parseInt(JOptionPane.showInputDialog("How many tests per student?"));

        for(int i = 1; i <= numStudents; i++){
            totalScores = 0;
            JOptionPane.showMessageDialog(null, String.format("Student number %d%n", i));
            for(int j = 1; j <= numTests; j++){
                testScore = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Enter scores %d : ", j)));
                totalScores += testScore;
            }
            averageScore = (double)totalScores/numTests;
            JOptionPane.showMessageDialog(null, String.format("The average for student %d%n is %.2f", i, averageScore));
        }
    }
}
