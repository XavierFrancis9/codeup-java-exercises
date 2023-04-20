package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("You entered: " + input.getString());
        System.out.println("You entered: " + input.yesNo());
        System.out.println("You entered: " + input.getInt());
        System.out.println("You entered: " + input.getInt(1,10));
        System.out.println("You entered: " + input.getDouble(1,10));
    }
}
