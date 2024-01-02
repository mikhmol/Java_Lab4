import java.util.Arrays;
import java.util.Comparator;

public class Student {
    private int studentId;
    private String studentName;
    private int age;
    private double averageGrade;
    private String major;

    public Student(int studentId, String studentName, int age, double averageGrade, String major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.averageGrade = averageGrade;
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", averageGrade=" + averageGrade +
                ", major='" + major + '\'' +
                '}';
    }

    public static Comparator<Student> sortByAverageGradeAsc = Comparator.comparingDouble(Student::getAverageGrade);

    public static Comparator<Student> sortByAgeDesc = Comparator.comparingInt(Student::getAge).reversed();
}