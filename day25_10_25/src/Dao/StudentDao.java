package Dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import beans.Student;

public class StudentDao {

	private static final String FILE_PATH = "students.ser";

    // Save list of students to file
    public void saveStudents(List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(students);
            System.out.println("✅ Students serialized successfully into " + FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read list of students from file
    @SuppressWarnings("unchecked")
    public List<Student> loadStudents() {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            students = (List<Student>) ois.readObject();
            System.out.println("✅ Students deserialized successfully from " + FILE_PATH);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
