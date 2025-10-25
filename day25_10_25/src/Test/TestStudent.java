package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Dao.StudentDao;
import Service.StudentService;
import beans.Student;
import exception.AttendanceShortageException;

public class TestStudent {
	public static void main(String[] args) {
		StudentService service = new StudentService();
        StudentDao dao = new StudentDao();

        // Create 10 students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Aarav", "Java", 85, 91));
        students.add(new Student(2, "Bhavna", "Python", 55, 88));
        students.add(new Student(3, "Chetan", "C++", 92, 76));
        students.add(new Student(4, "Divya", "HTML", 61, 84));
        students.add(new Student(5, "Esha", "SQL", 47, 90));
        students.add(new Student(6, "Farhan", "Java", 79, 82));
        students.add(new Student(7, "Geeta", "Python", 96, 95));
        students.add(new Student(8, "Harsh", "C#", 67, 72));
        students.add(new Student(9, "Isha", "React", 89, 85));
        students.add(new Student(10, "Jatin", "NodeJS", 59, 68));

        // Calculate grade
        for (Student s : students) {
            try {
                service.calculateGrade(s);
            } catch (AttendanceShortageException e) {
                System.out.println("⚠️ " + e.getMessage());
                s.setGrade("Not Eligible");
            }
        }

        // Sort in decreasing order of attendance
        Collections.sort(students);

        // Serialize to file
        dao.saveStudents(students);

        // Deserialize and display
        List<Student> loadedStudents = dao.loadStudents();
        System.out.println("\n--- Student List (Decreasing Attendance) ---");
        for (Student s : loadedStudents) {
            System.out.println(s);
        }
	}
}
