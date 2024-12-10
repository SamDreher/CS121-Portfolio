package weekFive;

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int years;
        int months;
        int totalRainfall = 0;
        double averageRainfall;

        System.out.println("Enter number of years");
        years = Integer.parseInt(keyboard.nextLine());
        for(int i = 1; i <= years; i++){
            for(int j = 1; j <= 12; j++)
            {
                System.out.printf("Enter inches of rainfall for year %d month %d%n", i, j);
                int rainfall = Integer.parseInt(keyboard.nextLine());
                totalRainfall += rainfall;
            }
        }
        months = years * 12;
        averageRainfall = (double)totalRainfall/months;

        System.out.printf("Number of months: %d%n Total inches of rainfall: %d%n Average rainfall per month for %d years: %.2f", months, totalRainfall, years, averageRainfall);
    }
}
