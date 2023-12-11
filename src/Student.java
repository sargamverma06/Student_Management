import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String studentId;
    private String name;
    public int age;
    private List<String> courses;

    public Student(String studentId, String name, int age, List<String> courses) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        this.courses.add(course);
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Courses: " + courses);
    }
}