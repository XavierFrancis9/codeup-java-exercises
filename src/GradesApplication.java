import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();


        Student xavier = new Student("Xavier");
        xavier.addGrade(100);
        xavier.addGrade(90);
        xavier.addGrade(85);
        students.put("xavier123", xavier);

        Student nick = new Student("Nick");
        xavier.addGrade(90);
        xavier.addGrade(89);
        xavier.addGrade(79);
        students.put("nick8768", nick);

        Student cole = new Student("Cole");
        xavier.addGrade(98);
        xavier.addGrade(68);
        xavier.addGrade(97);
        students.put("cole7474",cole);

        Student savanna = new Student("Savanna");
        xavier.addGrade(86);
        xavier.addGrade(79);
        xavier.addGrade(98);
        students.put("savanna5759", savanna);

        System.out.println("Welcome!");
        Input input = new Input();
        boolean confirm;

        do {
            System.out.println("\nHere are the GitHub usernames of our students: \n");

            for (String username : students.keySet()) {
                System.out.print("| " + username + " | ");
            }

            System.out.println("\n\nWhat student would you like to see more information on?");
            String selection1 = input.getString();
            if(students.containsKey(selection1)) {
                System.out.println("\nStudent name: " + students.get(selection1).getName());
                System.out.println("GitHub Username: " + selection1);
                System.out.println("Average grade: " + students.get(selection1).getAverageGrade());
            } else {
                System.out.println("Sorry, no student found with the GitHub username \"" + selection1 + "\".");
            }


            confirm = input.yesNo();

        } while(confirm);
        System.out.println("Goodbye, and have a wonderful day!");
    }
}
