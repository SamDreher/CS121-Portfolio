package weekEleven;

import java.util.ArrayList;

public class ArrayLists {
    private ArrayList<Integer> scoreList = new ArrayList<>();
    private ArrayList<Character> letterGradeList = new ArrayList<>();
    private ArrayList<Double> gpaList = new ArrayList<>();
    private ArrayList<String> nameList = new ArrayList<>();

    public void addScore(int score) {
        scoreList.add(score);
    }

    public void removeScore(int score) {
        scoreList.remove(score);
    }

    public int getScore(int index) {
        return scoreList.get(index);
    }

    public int getSizeOfScoreList() {
        return scoreList.size();
    }

    public void displayScores1() {
        System.out.printf("Scores:\n");
        for (int score : scoreList) {
            System.out.printf("%d\n", score);
        }
    }

    public void displayScores2() {
        System.out.printf("Scores:\n");
        for (int i = 0; i < scoreList.size(); i++) {
            System.out.printf("%d\n", scoreList.get(i));
        }
    }
}
