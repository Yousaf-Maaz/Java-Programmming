// Create a Java program that models a simple role-playing game using polymorphism. The
// game consists of three types of characters: warriors, mages, and thieves. Each character
// has a name and a unique set of abilities. Warriors are strong and attack with swords, mages
// are intelligent and attack with fireballs, and thieves are agile and attack with daggers.
// The Character class is the superclass of the three character types and has a name instance
// variable and an empty attack() method. The subclasses Warrior, Mage, and Thief inherit
// from the Character class and each one implements its own unique version of the attack()
// method, as well as an additional instance variable (strength for Warrior, intelligence for
// Mage, and agility for Thief).
// Your task is to create a Main class that creates instances of each character type and calls
// their attack() method using polymorphism. Each character's unique ability should also be
// displayed along with their name. For example, "John attacks with strength 10" for a warrior
// named John. Use type casting to access each character's unique ability.







import java.util.Scanner;

// Base class Character
class Character {
    String name;

    // Empty attack method to be overridden by subclasses
    public void attack() {
        // Empty method
    }
}

// Subclass Warrior
class Warrior extends Character {
    int strength;

    // Constructor
    public Warrior(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    // Override attack method
    @Override
    public void attack() {
        System.out.println(name + " attacks with strength " + strength);
    }
}

// Subclass Mage
class Mage extends Character {
    int intelligence;

    // Constructor
    public Mage(String name, int intelligence) {
        this.name = name;
        this.intelligence = intelligence;
    }

    // Override attack method
    @Override
    public void attack() {
        System.out.println(name + " attacks with fireballs using intelligence " + intelligence);
    }
}

// Subclass Thief
class Thief extends Character {
    int agility;

    // Constructor
    public Thief(String name, int agility) {
        this.name = name;
        this.agility = agility;
    }

    // Override attack method
    @Override
    public void attack() {
        System.out.println(name + " attacks with daggers using agility " + agility);
    }
}

public class simple_role_playing_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Warrior
        System.out.println("------------------------------------------------------\n");
        System.out.println("Enter the warrior name:");
        String warriorName = scanner.nextLine();
        System.out.println("------------------------------------------------------\n");
        System.out.println("Enter the warrior strength:");
        int warriorStrength = scanner.nextInt();
        Warrior warrior = new Warrior(warriorName, warriorStrength);

        // Input for Mage
        scanner.nextLine(); 
        System.out.println("------------------------------------------------------\n");
        System.out.println("Enter the mage name:");
        String mageName = scanner.nextLine();
        System.out.println("------------------------------------------------------\n");
        System.out.println("Enter the mage intelligence:");
        int mageIntelligence = scanner.nextInt();
        Mage mage = new Mage(mageName, mageIntelligence);

        // Input for Thief
        scanner.nextLine(); 
        System.out.println("------------------------------------------------------\n");
        System.out.println("Enter the thief name:");
        String thiefName = scanner.nextLine();
        System.out.println("------------------------------------------------------\n");
        System.out.println("Enter the thief agility:");
        int thiefAgility = scanner.nextInt();
        Thief thief = new Thief(thiefName, thiefAgility);

        // Call attack method for each character
        warrior.attack();
        mage.attack();
        thief.attack();

        scanner.close();
    }
}
