import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentManagementSystem {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("200544724", "Sargam", 21, Arrays.asList("Computer Science", "Mathematics")));
        students.add(new Student("20075344", "Stuti", 24, Arrays.asList("Physics", "Business")));
        students.add(new Student("2074646", "Ridhi", 22, Arrays.asList("Chemistry", "Computer Science")));
        students.add(new Student("2022246", "kiran", 29, Arrays.asList("Psychology", "Dance")));
        students.add(new Student("2000000", "Juan", 23, Arrays.asList("latin", "Computer Science")));

        // Display the details of all students in the system using Java streams
        students.stream().forEach(Student::displayStudentDetails);
        System.out.println("----------------");
        // Find and display the students who are enrolled in a specific course using Java streams
        System.out.println("\nStudents enrolled in 'Computer Science':");
        students.stream()
                .filter(student -> student.getCourses().contains("Computer Science"))
                .forEach(Student::displayStudentDetails);
        System.out.println("----------------");
        // Update the age of a specific student using Java streams
        Student studentToUpdate = students.stream()
                .filter(student -> student.getStudentId().equals("2022246"))
                .findFirst()
                .orElse(null);
        if (studentToUpdate != null) {
            studentToUpdate.age = 25;
            System.out.println("\nUpdated details of student with ID '2022246':");
            studentToUpdate.displayStudentDetails();
        }
        System.out.println("----------------");
        // Calculate and display the average age of all students using Java streams
        double averageAge = students.stream()
                .mapToInt(Student::getAge)
                .average()
                .orElse(0);
        System.out.println("\nAverage age of all students: " + averageAge);
        System.out.println("----------------");
    }
}