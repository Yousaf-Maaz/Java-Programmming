import  java.util.Scanner;
public class Labwork {

    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter The weight Bhaiya");

    //we will take the value in double or float.i will go for double
    double weight=input.nextDouble();
    System.out.println("Enter The height Bhaiya");

    //we will take the value in double or float.i will go for double
    double height=input.nextDouble();
    
    //now will try BMI Formula here.
    //The formula for BMI is weight in kilograms divided by height in meters squared

    double Body_Mass_index =weight/(height*height);

    System.out.println("The Body Mass Index is "+Body_Mass_index);


}
}