package weekEight;

public class Test {
    public static void main(String[] args) {

        // Question 9

        int num = 20;
        if (num % 3 == 2) {
            System.out.println("Divisible by 3");
        }
        if (num % 4 == 0) {
            System.out.println("Divisible by 4");
        }
        if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        }

        // Question 10

        String[] flowers = {"rose", "tulip", "lupine", "chrysantheum", "catalaya"};
        System.out.println(flowers[2]);

        // Question 11

        for(String flower: flowers) {
            System.out.println(flower + "");
        }
    }
}
