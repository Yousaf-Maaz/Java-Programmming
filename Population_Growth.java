/*Qno2:
(World Population Growth Calculator) Use the web to determine the current
world population and the annual world population growth rate. Write an
application that inputs these values, then displays the estimated world
population after one, two, three, four and five years. */

import java.util.Scanner;

public class Population_Growth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double currentPopulation;
        double year1;
        double year2;
        double year3;
        double year4;
        double year5;
        float growthRate;

        System.out.print("Enter the current world population (Go and Sreach in Google): ");
        currentPopulation = input.nextDouble();

        System.out.print("Enter the annual world population growth rate (in percent): ");
        growthRate = input.nextFloat();
        growthRate = growthRate / 100;

        
        for (int year = 1; year <= 5; year++) {
            currentPopulation = currentPopulation + (currentPopulation * growthRate);
            System.out.printf("\nWorld population after %d year(s): %f\n", year, currentPopulation);
        }
    }
}
