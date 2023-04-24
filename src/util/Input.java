package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter a string: ");
        return scanner.next();
    }

    public int getInt() {
        System.out.println("Enter an integer: ");
        return scanner.nextInt();
    }

    public int getIntChoice() {
        return scanner.nextInt();
    }

    public double getDouble() {
        System.out.println("Enter a double: ");
        return scanner.nextDouble();
    }

    public boolean yesNo() {
        System.out.println("\nContinue? [Y/N]");
        String input = scanner.next();
        if(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int input;
        do {
            System.out.printf("Enter a number within the range of %s and %s%n", min, max);
            input = scanner.nextInt();

            if(input < min || input > max) {
                System.out.println("Invalid Input!");
            }
        } while(input < min || input > max);
        return input;
    }

    public double getDouble(double min, double max) {
        double input;
        do {
            System.out.printf("Enter a number within the range of %s and %s%n", min, max);
            input = scanner.nextDouble();

            if(input < min || input > max) {
                System.out.println("Invalid Input!");
            }
        } while(input < min || input > max);
        return input;
    }


    public static void main(String[] args) {

    }
}
