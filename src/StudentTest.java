public class StudentTest {
    public static void main(String[] args) {
        Student xavier = new Student("xavier");

        xavier.addGrade(100);
        xavier.addGrade(90);
        xavier.addGrade(85);

        System.out.println(xavier.getAverageGrade());
    }
}
