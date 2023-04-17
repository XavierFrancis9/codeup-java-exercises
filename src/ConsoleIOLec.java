// imports are always at the top of the class
import java.util.Scanner;

public class ConsoleIOLec {
    public static void main(String[] args) {
        String name = "Xavier";
        String lastName = "Francis";

        System.out.printf("Hello there, %s %s.%nNice to see you.%n", name, lastName);

        Scanner user = new Scanner(System.in);
        System.out.println("What is your birth month?");
        String userInput = user.next();
        System.out.println("You entered : --> \"" + userInput + "\" <--");

        Scanner user2 = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String userInput2 = user2.nextLine();
        System.out.println("You entered : --> \"" + userInput2 + "\" <--");

        System.out.println("Enter a number: ");
        int userNum = user.nextInt();
        System.out.println("Your favorite number is : " + userNum);


    }
}
