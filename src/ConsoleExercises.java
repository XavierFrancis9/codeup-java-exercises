import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Float.parseFloat;

public class ConsoleExercises {
    public static void main (String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner user = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userNum = user.nextInt();
        System.out.printf("You entered: %s%n", userNum);

        System.out.println("Enter 3 words: ");
        String userInput1 = user.next();
        String userInput2 = user.next();
        String userInput3 = user.next();
        System.out.printf("You entered the words: %s, %s, and %s%n", userInput1, userInput2, userInput3);

        Scanner sentence = new Scanner(System.in);
        System.out.println("Type a full sentence: ");
        String userSentence = sentence.nextLine();
        System.out.println("You entered: \"" + userSentence + "\"");

        Scanner length = new Scanner(System.in);

        System.out.println("What is the width of the codeup classroom?");
        String userLength = length.nextLine();
        Float parseLength = Float.parseFloat(userLength);

        System.out.println("What is the length of the codeup classroom?");
        String userWidth = length.nextLine();
        Float parseWidth = Float.parseFloat(userWidth);

        System.out.println("What is the height of the codeup classroom?");
        String userHeight = length.nextLine();
        Float parseHeight= Float.parseFloat(userHeight);

        Float perimeter = (parseLength * 2) + (parseWidth * 2);
        Float area = parseLength * parseWidth;
        Float volume = parseLength * parseWidth * parseHeight;

        System.out.println("The room has a perimeter of: " + perimeter);
        System.out.println("The room has an area of: " + area);
        System.out.println("The room has a volume of: " + volume);
    }
}
