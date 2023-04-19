import java.awt.*;
import java.util.Scanner;

public class MethodsExercise {
    public static void main(String[] args) {
//        add(10,5);
//        subtract(10,5);
//        multiply(10,5);
//        divide(10,5);
//        remainder(10,5);
//        getInteger(1, 10);
//        factorial();
        diceGame();
    }
    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public static void subtract(int num1, int num2) {
        System.out.println(num1 - num2);
    }
    public static int multiply(int num1, int num2) {
        if(num2 == 0) {
            int result = 0;
            System.out.println(result);
            return result;
        } else if(num2 > 0) {
            int result = num1 + multiply(num1, num2 - 1);
            System.out.println(result);
            return result;
        } else {
            int result =  -multiply(num1, -num2);
            System.out.println(result);
            return result;
        }
    }

    public static void divide(int num1, int num2) {
        System.out.println(num1 / num2);
    }
    public static void remainder(int num1, int num2) {
        System.out.println(num1 % num2);
    }
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        int userInput = sc.nextInt();
        if(userInput >= min && userInput <= max) {
            System.out.println("Thanks for your input!");
            return userInput;
        } else {
            System.out.println("Invalid Input!");
            return getInteger(min, max);
        }
    }

    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int factorialInput = sc.nextInt();
        while (factorialInput < 1 || factorialInput > 10) {
            System.out.println("Invalid input! Enter a number between 1 and 10");
            factorialInput = sc.nextInt();
        }
        for (int i = 1; i <= factorialInput; i++) {
            long result = calculateFactorial(i);
            String equation = "";
            for (int j = 1; j <= i; j++) {
                equation += j;
                if (j != i) {
                    equation += " x ";
                }
            }
            System.out.printf("%d! = %-15s = %d%n", i, equation, result);
        }
    }

    public static long calculateFactorial (int n) {
        if(n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n-1);
        }
    }

    // dice roll game
    public static void diceGame() {
        Scanner input = new Scanner(System.in);
        String response;
        String farwell = "See you next time!";
        int numSides;
        do {
            System.out.println("How many sides would you like your dice?");
            numSides = input.nextInt();
            System.out.println("Are you ready? [QUIT/ROLL]");
            String choice = input.next();

            if (choice.equalsIgnoreCase("quit")) {
                break;
            }

            int roll1 = roll(numSides);
            int roll2 = roll(numSides);

            System.out.println("You rolled [ " + roll1 + " ] " + "and [ " + roll2 + " ]");

            System.out.println("Would you like to play again? [Y/N]");
            response = input.next();

        } while (response.equalsIgnoreCase("Y"));
        System.out.println(farwell);
    }

    public static int roll(int numSides) {
        return (int)(Math.random() * numSides + 1);
    }
}
