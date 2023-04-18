import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Bob's world! Say something to him:");

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (input.endsWith("?")) {
                System.out.println("Sure.");
            } else if (input.endsWith("!") && input.equals(input.toUpperCase())) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever.");
            }
        }
    }
}
