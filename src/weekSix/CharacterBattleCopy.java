package weekSix;

import java.util.Random;
import java.util.Scanner;

public class CharacterBattleCopy {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        // Variables

        int rounds;

        //Player 1

        String name;
        int hitPoints;
        String move;
        int movePower;
        int atkSpeed;

        //Player 2

        String name2;
        int hitPoints2;
        String move2;
        int movePower2;
        int atkSpeed2;

        int initialHitPoints;
        int initialHitPoints2;
        int points = 0;
        int points2 = 0;

        // Setup

        System.out.println("Enter an odd number of rounds: ");
        rounds = Integer.parseInt(keyboard.nextLine());

        for (int i = 0; i < rounds; i++) {

            // Player 1
            System.out.printf("Round: %d%n------------------------ %n", (i + 1));
            System.out.println("Player 1: Create a character and enter its stats.");
            System.out.println("What is the character name? ");
            name = keyboard.nextLine();
            System.out.println("How many Hit Points does the character have? ");
            initialHitPoints = Integer.parseInt(keyboard.nextLine());
            hitPoints = initialHitPoints;
            System.out.println("What move is being used? ");
            move = keyboard.nextLine();
            System.out.println("What is the move power? ");
            movePower = Integer.parseInt(keyboard.nextLine());
            System.out.println("How fast is the attack? ");
            atkSpeed = Integer.parseInt(keyboard.nextLine());
            String playerOneHeader = String.format("%s %s %d %d", name, move, movePower, atkSpeed);
            System.out.println(playerOneHeader);

            // Player 2

            System.out.println("\nPlayer 2: Create a character and enter its stats.");
            System.out.println("What is the character name? ");
            name2 = keyboard.nextLine();
            System.out.println("How many Hit Points does the character have? ");
            initialHitPoints2 = Integer.parseInt(keyboard.nextLine());
            hitPoints2 = initialHitPoints2;
            System.out.println("What move is being used? ");
            move2 = keyboard.nextLine();
            System.out.println("What is the move power? ");
            movePower2 = Integer.parseInt(keyboard.nextLine());
            System.out.println("How fast is the attack? ");
            atkSpeed2 = Integer.parseInt(keyboard.nextLine());
            String playerTwoHeader = String.format("%s %s %d %d", name2, move2, movePower2, atkSpeed2);
            System.out.println(playerTwoHeader);

            // Check character speed

            while ((hitPoints > 0 && hitPoints2 > 0)) {
                if (atkSpeed > atkSpeed2) {
                    hitPoints2 -= movePower;

                    // Check if Hit Points is 0 or less

                    if (hitPoints2 <= 0) {
                        System.out.println("Player 1 is the round winner!");
                        points++;
                        break;
                    }
                    hitPoints -= movePower2;
                    if (hitPoints <= 0) {
                        System.out.println("Player 2 is the round winner!");
                        points2++;
                        break;
                    }
                } else if (atkSpeed2 > atkSpeed) {
                    hitPoints -= movePower2;
                    if (hitPoints <= 0) {
                        System.out.println("Player 2 is the round winner!");
                        points2++;
                        break;
                    }
                    hitPoints2 -= movePower;
                    if (hitPoints2 <= 0) {
                        System.out.println("Player 1 is the round winner!");
                        points++;
                        break;
                    }
                } else {
                    int num = rand.nextInt(2);
                    if (num == 1) {
                        hitPoints2 -= movePower;
                        if (hitPoints2 <= 0) {
                            System.out.println("Player 1 is the round winner!");
                            points++;
                            break;
                        }
                        hitPoints -= movePower2;
                        if (hitPoints <= 0) {
                            System.out.println("Player 2 is the round winner!");
                            points2++;
                            break;
                        }
                    } else {
                        hitPoints -= movePower2;
                        if (hitPoints <= 0) {
                            System.out.println("Player 2 is the round winner!");
                            points2++;
                            break;
                        }
                        hitPoints2 -= movePower;
                        if (hitPoints2 <= 0) {
                            System.out.println("Player 1 is the round winner!");
                            points++;
                            break;
                        }
                    }
                }

            }
            System.out.println("\nWins: ");
            System.out.println("Player 1 Wins: " + points);
            System.out.println("Player 2 Wins: " + points2);
            System.out.println();

        }

        System.out.println("\nFinal Scores: ");
        System.out.println("** Player 1 Wins: " + points);
        System.out.println("** Player 2 Wins: " + points2);

        if (points > points2) {
            System.out.println(">> Player 1 has won! ");
        } else {
            System.out.println(">> Player 2 has won! ");
        }
    }
}