package weekEleven;

import java.util.ArrayList;

public class CustomerInfo {
    private ArrayList<Integer> scores = new ArrayList<>();
    private ArrayList<Character> letterGrade = new ArrayList<>();
    private ArrayList<Double> gpas = new ArrayList<>();
    private ArrayList<String> names = new ArrayList<>();

    public void addName(String name) {
        this.names.add(name);
    }
    public void addGPA(double gpa) {
        this.gpas.add(gpa);
    }
    public void addLetterGrade(char grade) {
        this.letterGrade.add(grade);
    }
    public void addScores(int score) {
        this.scores.add(score);
    }
    public void displayCourses() {
        System.out.printf("%-10s%-10s%-10s%s%n","Course","GPA","Score","Grade");
        for(int i = 0; i < names.size(); i++) {
            System.out.printf("%-10s%-10.2f%-10d%c%n", names.get(i), gpas.get(i), scores.get(i), letterGrade.get(i));
        }
    }
}
