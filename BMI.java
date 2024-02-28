/*
 * Qno1:(Test-Drive: Body Mass Index Calculator) Obesity causes significant
increases in illnesses such as diabetes and heart disease. To determine
whether a person is overweight or obese, you can use a measure called the
body mass index (BMI). The United States Department of Health and Human
Services provides a BMI calculator at:
http://www.nhlbi.nih.gov/guidelines/obesity/BMI/bmicalc.htm
Use it to calculate your own BMI. A forthcoming exercise will ask you to
program your own BMI calculator. To prepare for this, use the web to research
the formulas for calculating BMI.
 */



import java.util.Scanner;

public class BMI {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------------------------------------------\n");
        System.out.println("Enter The weight:");

        double weight = input.nextDouble();
        System.out.println("----------------------------------------------------------\n");
        System.out.println("Enter The height:");

        double height = input.nextDouble();

        // The formula for BMI is weight in kilograms divided by height in meters squared
        double Body_Mass_index = weight / (height * height);

        System.out.println("----------------------------------------------------------\n");
        System.out.println("The Body Mass Index is " + Body_Mass_index);

        // Categorizing the BMI
        if (Body_Mass_index < 18.5) {
            System.out.println("You are Underweight.");
        } else if (Body_Mass_index >= 18.5 && Body_Mass_index <= 24.9) {
            System.out.println("You have Normal weight.");
        } else if (Body_Mass_index >= 25 && Body_Mass_index <= 29.9) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }
    }
}