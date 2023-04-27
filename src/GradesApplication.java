import util.Input;

import java.util.ArrayList;
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
        nick.addGrade(90);
        nick.addGrade(89);
        nick.addGrade(79);
        students.put("nick8768", nick);

        Student cole = new Student("Cole");
        cole.addGrade(98);
        cole.addGrade(68);
        cole.addGrade(97);
        students.put("cole7474",cole);

        Student savanna = new Student("Savanna");
        savanna.addGrade(86);
        savanna.addGrade(79);
        savanna.addGrade(98);
        students.put("savanna5759", savanna);

        System.out.println("Welcome!");
        Input input = new Input();
        boolean confirm;

        do {
            System.out.println("\nHere are the GitHub usernames of our students: \n");

            for (String username : students.keySet()) {
                System.out.print("| " + username + " | ");
            }

            System.out.println("\n\nType the username of the student would you like to see more information on \n---OR---\nType \"ALL\" to see the information of all students");
            String selection1 = input.getString();
            if(students.containsKey(selection1)) {

                System.out.println("\nStudent name: " + students.get(selection1).getName());
                System.out.println("GitHub Username: " + selection1);
                System.out.println(students.get(selection1).getGrades());
                System.out.println("Average grade: " + students.get(selection1).getAverageGrade());
            } else if (selection1.equalsIgnoreCase("all")) {
                System.out.println("\n----  Please make a selection  ----\n1 --- View ALL Student Reports\n2 --- View Overall Class Average\n3 --- Print CSV report\n");
                System.out.println("Please make your selection: \n");
                int selection2 = input.getInt();

                switch(selection2) {
                    case 1:
                        for(String username : students.keySet()) {
                            System.out.println("\nStudent name: " + students.get(username).getName());
                            System.out.println("GitHub Username: " + username);
                            System.out.println(students.get(username).getGrades());
                            System.out.println("Average grade: " + students.get(username).getAverageGrade());
                        }
                        break;

                    case 2:
                        ArrayList<Double> classAvgs = new ArrayList<>();
                        double avgSum = 0;
                        for(String user : students.keySet()) {
                            classAvgs.add(students.get(user).getAverageGrade());
                            avgSum += (students.get(user).getAverageGrade());
                        }
                        System.out.println("\nThe overall class average is: " + avgSum/classAvgs.size());
                        break;

                    case 3:
                        for(String user : students.keySet()) {
                            System.out.println(students.get(user).getName() + ", " + user + ", " + students.get(user).getGrades()+ ", " + students.get(user).getAverageGrade());
                        }
                }


            } else {
                System.out.println("Sorry, no student found with the GitHub username \"" + selection1 + "\".");
            }

            confirm = input.yesNo();

        } while(confirm);
        System.out.println("Goodbye, and have a wonderful day!");
    }
}
