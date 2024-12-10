package weekTwelve;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a file instance
        File fileOutput = new File("TestingFileWrite.txt");

        // Syntax:
        // try{}catch(){}
        try {

            // Create a scanner object
            Scanner console = new Scanner(fileOutput);
            String header = console.nextLine();
            System.out.printf("%s", header); // Displays header
            while(console.hasNextLine()) {
                String name = console.next();
                String passWord = console.next();
                int score = Integer.parseInt(console.next());
                String playerCharacter = console.next();
                double winningPercent = Double.parseDouble(console.next());

                System.out.printf("%n%-20s %-20s %6d %23s %15.2f", name, passWord, score, playerCharacter, winningPercent);
            }
            console.close();

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
