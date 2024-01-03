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

    public static Comparator<Student> sortCast = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            double mult = o1.getAge() * o1.getAverageGrade();
            double mult2 = o2.getAge()* o2.getAverageGrade();
            if(mult < mult2){
                return -1;
            } else if (mult > mult2){
                return 1;
            }
            return 0;
        }
    };
}