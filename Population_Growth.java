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

        year1 = currentPopulation + (currentPopulation * growthRate);
        System.out.printf("\nWorld population after one year: %f\n", year1);

        currentPopulation = year1;

        year2 = currentPopulation + (currentPopulation * growthRate);
        System.out.printf("After two years:%f \n", year2);

        currentPopulation = year2;

        year3 = currentPopulation + (currentPopulation * growthRate);
        System.out.printf("After three years:%f \n", year3);

        currentPopulation = year3;

        year4 = currentPopulation + (currentPopulation * growthRate);
        System.out.printf("After four years:%f \n", year4);

        currentPopulation = year4;

        year5 = currentPopulation + (currentPopulation * growthRate);
        System.out.printf("After five years:%f \n", year5);
    }
}
