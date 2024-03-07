/*Write a class named Dice that contains a data member “value”. In the default constructor
initialize the value with 0. The class should contain a method named roll(). This method
generates a random no between 1 and 6 (for the dice), updates the value of dice and
displays it. If the value generated is equal to 6 then a message “Chakkaaaa” should
display. */

import java.util.Random;
import java.util.Scanner;

public class Dice {
    private int value;

    // Default constructor value given.
    public Dice() {
        this.value = 0;
    }

    // Method to roll the dice
    public void roll() {
        Random rand = new Random();
        int rolledValue = rand.nextInt(6) + 1;

        System.out.println(
                "Side: " + rolledValue + " " + (rolledValue == 6 ? "(Chakkaaaaa)" : "(better luck next time)"));
        this.value = rolledValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Do you want to roll the dice? Y/N");
            String userInput = scanner.next();

            if (userInput.equalsIgnoreCase("Y")) {
                Dice dice = new Dice();
                dice.roll();
            } else if (userInput.equalsIgnoreCase("N")) {
                System.out.println("Khatam bYe bYe.");
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        } while (true);

        scanner.close();
    }
}
