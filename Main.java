import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Mikhailo", 20, 100, "Computer Science"),
                new Student(2, "Ivan", 19, 96, "Mathematics"),
                new Student(3, "Roman", 18, 78, "Physics"),
                new Student(4, "Oleksiy", 19, 90, "Chemistry"),
                new Student(5, "Masha", 20, 5, "Biology")
        };

        Arrays.sort(students, Student.sortByAverageGradeAsc);
        System.out.println("Сортування за зростанням поля averageGrade:");
        printStudents(students);

        Arrays.sort(students, Student.sortByAgeDesc);
        System.out.println("\nСортування за спаданням поля age:");
        printStudents(students);
    }

    private static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}