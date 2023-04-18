import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // question 1
        // part a

        // while loop that prints 5 thru 15
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

        // part b

        // do while loop that counts up to 100 by 2
//        int x = 0;
//
//        do {
//            System.out.println(x);
//            x+=2;
//        } while (x < 100); {
//            System.out.println(x);
//        }

        // do while loop that counts down to 0 by 5
//        int y = 100;
//
//        do {
//            System.out.println(y);
//            y-=5;
//        } while (y > 0); {
//            System.out.println(y);
//        }

        // do while loop that displays num squared less than 1000000
//        int z = 2;
//
//        do {
//            System.out.println(z);
//            z *= z;
//        } while (z < 65536);
//        System.out.println(z);

        // part c
        // refactor part a/b using for loops

//        for(int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//
//        for(int x = 0; x <= 100; x+=2) {
//            System.out.println(x);
//        }
//
//        for (int y = 100; y >= 0; y-=5) {
//            System.out.println(y);
//        }
//
//        for(long z = 2; z <= 65536; z *= z) {
//            System.out.println(z);
//        }
        // question 2 FizzBuzz
//        String fizz = "Fizz";
//        String buzz = "Buzz";
//
//        for(int i = 1; i <=100; i++) {
//            if(i%3 == 0 && i%5 ==0) {
//                System.out.println(fizz + buzz);
//            } else if(i%3 ==0) {
//                System.out.println(fizz);
//            } else if(i%5 ==0) {
//                System.out.println(buzz);
//            }
//        }
        // question 3 table of powers
        Scanner user = new Scanner(System.in);
        System.out.println("What number would you like to go up to? ");
        int userNum = user.nextInt();
        System.out.printf("Number | Squared | Cubed%n------ | ------- | -----%n");

        for(int i = 1; i <= userNum; i++) {
            long squared = i * i;
            long cubed = squared * i;

            System.out.printf("%-6d | %-7d | %-5d%n", i, squared, cubed);
        }

    }
}
