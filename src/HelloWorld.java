//shortcut psvm || main + tab
public class HelloWorld {
    public static void main(String[] args){
        // this logs things into the command line
        // strings in java must be in double quotes! (single quotes are reserved for single characters)
        // MUST use semicolons are end of statements IOT compile
        // short cut is sout + tab
        System.out.println("Hello, World!");
        System.out.print("Hello,");
        System.out.print(" World!");
        System.out.println();

        int myFavoriteNumber = 9;
        System.out.println(myFavoriteNumber);

        String myString = "This is a string";
        System.out.println(myString);

        double myNumber = 3.14;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        int y = 4;
        y += 5;
        System.out.println(y);

        int a = 3;
        int b = 4;
        b *= a;
        System.out.println(b);

        int d = 10;
        int e = 2;
        d /= y;
        e -= x;
        System.out.println(d);
        System.out.println(e);

    }
}
