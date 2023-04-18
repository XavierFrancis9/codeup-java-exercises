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

//         do while loop that displays num squared less than 1000000
//        long z = 2;
//
//        do {
//            System.out.println(z);
//            z *= z;
//        } while (z <= 1_000_000);

        // part c
        // refactor part a/b using for loops

        for(int i = 5; i <= 15; i++) {
            System.out.print(i + " ");
        }

        for(int x = 0; x <= 100; x+=2) {
            System.out.println(x);
        }

        for (int y = 100; y >= 0; y-=5) {
            System.out.println(y);
        }

        for(long z = 2; z <= 65536; z *= z) {
            System.out.println(z);
        }
        // question 2 FizzBuzz
        String fizz = "Fizz";
        String buzz = "Buzz";

        for(int i = 1; i <=100; i++) {
            if(i%3 == 0 && i%5 ==0) {
                System.out.println(i + " " + fizz + buzz);
            } else if(i%3 ==0) {
                System.out.println(i + " " + fizz);
            } else if(i%5 ==0) {
                System.out.println(i + " " + buzz);
            } else {
                System.out.println(i);
            }
        }
        // question 3 table of powers
        String userInput;
        do {
            Scanner user = new Scanner(System.in);
            System.out.println("What number would you like to go up to? ");
            int userNum = user.nextInt();
            System.out.printf("Number | Squared | Cubed%n------ | ------- | -----%n");

            for (int i = 1; i <= userNum; i++) {
                long squared = i * i;
                long cubed = squared * i;

                System.out.printf("%-6d | %-7d | %-5d%n", i, squared, cubed);
            }

            System.out.println("Continue? [y/N]\n");
            userInput = user.next();
        } while (userInput.equalsIgnoreCase("y"));
        System.out.println("See you next time!");


        // question 4 grades
        String continueGrades;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your numeric grade: \n");
            int userGrade = sc.nextInt();

            if (userGrade <= 59) {
                System.out.println("F");
            } else if (userGrade <= 66) {
                if(userGrade <= 62) {
                    System.out.println("D-");
                } else if(userGrade <= 64) {
                    System.out.println("D");
                } else {
                    System.out.println("D+");
                }
            } else if (userGrade <= 79) {
                if(userGrade <= 71) {
                    System.out.println("C-");
                } else if(userGrade <= 75) {
                    System.out.println("C");
                } else {
                    System.out.println("C+");
                }
            } else if (userGrade <= 87) {
                if(userGrade <= 83) {
                    System.out.println("B-");
                } else if(userGrade <= 85) {
                    System.out.println("B");
                } else {
                    System.out.println("B+");
                }
            } else {
                if(userGrade <= 92) {
                    System.out.println("A-");
                } else if(userGrade <= 96) {
                    System.out.println("A");
                } else if (userGrade <= 100){
                    System.out.println("A+");
                } else {
                    System.out.println("Not a valid grade");
                }
            }

            System.out.println("Continue? [y/N]\n");
            continueGrades = sc.next();
        } while (continueGrades.equalsIgnoreCase("y"));
        System.out.println("See you next time!");
    }
}
