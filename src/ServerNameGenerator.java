import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        System.out.println("The name of your server is:\n" +  getUserName());

    }

    static String[] adjectives = {"fast", "slow", "dumb", "smart", "ugly", "pretty", "large", "small", "round", "square"};

    static String[] nouns = {"car", "boat", "plane", "man", "woman", "chair", "table", "computer", "phone", "cup"};
    public static String getUserName() {
        Random random = new Random();
        int adjIndex = random.nextInt(adjectives.length);
        int nounIndex = random.nextInt(nouns.length);
        return adjectives[adjIndex] + "-" + nouns[nounIndex];
    }
}
