import java.sql.SQLOutput;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        numberGuesser();
    }

    public static int getRandom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the MAX for random number could be");
        int input = sc.nextInt();
        System.out.println("You input: " + input + "\n");
        return (int)(Math.floor(Math.random() * input) + 1);
    }

    public static void numberGuesser() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String response;
        int input;
        int randomNumber = getRandom();
        System.out.println("Welcome to the NUMBER GUESSER!\nYou have 10 guesses");
        do{
            System.out.println("Please guess a number");
            input = sc.nextInt();

            if(input < randomNumber) {
                count +=1;
                System.out.println("HIGHER");
                System.out.println("Total Guesses: " + count);
            } else if (input > randomNumber) {
                count +=1;
                System.out.println("LOWER");
                System.out.println("Total Guesses: " + count);
            } else {
                System.out.println("BINGO! Good job!");
                System.out.println("Total Guesses: " + count);
            }
        } while(input != randomNumber && count < 10);
        System.out.printf("Would you like to play again? [Y/N]\n");
        response = sc.next();
        if(response.equalsIgnoreCase("Y")) {
            numberGuesser();
        } else {
            System.out.println("See you next time!");
        }

    }
}
