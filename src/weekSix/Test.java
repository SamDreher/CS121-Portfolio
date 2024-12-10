package weekSix;

public class Test {
    public static void main(String[] args) {
        // 2D Array
        double [][] score = {
                {1.1, 2.2, 3.3},
                {4.4, 5.5, 6.6},
                {7.7, 8.8, 9.9}
        };
        System.out.println("Display the scores: ");
        for(int i = 0; i < score.length; i++){
            for(int j = 0; j < score[i].length; j++){

                System.out.println(score[i][j]);
            }
        }
        for(double[] row: score){
            for(double column: row){
                System.out.printf("%.1f", column);
            }
        }
    }
}
