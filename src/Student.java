import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.grades = new ArrayList<Integer>();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getAverageGrade() {
        if(this.grades.isEmpty()) {
            return 0;
        } else {
            int sum = 0;
            for (int grade : this.grades) {
                sum += grade;
            }
            return (double) sum / this.grades.size();
        }
    }
}
