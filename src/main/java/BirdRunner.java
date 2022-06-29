/*
 * Create a simple game that asks the player what type of bird it would like to capture and tells them if their bird was able to escape the monster based on how fast their bird can fly.

You will need the following:

A "Runner" class to run your game
A method to ask the user what type of bird they want
A CanFly interface to use as the type of the bird object you will use
A fly() method in your CanFly interface, but it will return an int that represents the speed at which the bird is flying instead of returning nothing like our sample code above
A method to ask the user how fast the monster is
An if statement that lets the bird escape if their speed is faster than the speed of the monster
In writing this code, you should be able to see that once you've created the instance of the bird the user asked for, you shouldn't have to worry about its specific type anymore.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class BirdRunner {

    private static void log(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        CanFly userBird = getUserBird();
        int monsterSpeed = getMonsterSpeed();

        int birdSpeed = userBird.fly();
        if (birdSpeed > monsterSpeed) {
            log("Your bird was fast enough to escape");
        } else {
            log("Your bird was not fast enough to escape :-(");
        }
    }

    private static CanFly getUserBird() {
        Scanner inputScanner = new Scanner(System.in);
        while (true) {
            log("Please enter the type of bird you would like");
            log("1. Pigeon");
            log("2. Puffin");
            try {
                int userSelection = inputScanner.nextInt();
                if (userSelection == 1) {
                    return new Pigeon();
                } else if (userSelection == 2) {
                    return new Puffin();
                } else {
                    throw new InputMismatchException("Value must be either 1 or 2");
                }
            } catch(InputMismatchException inputException) {
                inputScanner.nextLine(); // clear the invalid input
                log("Invalid input - " + inputException.getMessage());
            }
        }
    }

    private static int getMonsterSpeed() {
        Scanner inputScanner = new Scanner(System.in);
        while (true) {
            log("How fast can the monster fly (in mph)?");
            try {
                int monsterSpeed = inputScanner.nextInt();
                return monsterSpeed;
            } catch(InputMismatchException inputException) {
                inputScanner.nextLine(); // clear the invalid input
                log("Invalid input - " + inputException.getMessage());
            }
        }
    }
}