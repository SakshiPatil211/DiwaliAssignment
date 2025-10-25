package Service;

import beans.Student;
import exception.AttendanceShortageException;

public class StudentService {
	// Method to calculate Grade
    public void calculateGrade(Student s) throws AttendanceShortageException {
        if (s.getAttendance_percentage() < 60) {
            throw new AttendanceShortageException("Attendance below 60%! Student " + s.getSname() + " is not eligible for grade calculation.");
        }

        double score = s.getScore();
        String grade;
        if (score >= 90) grade = "A+";
        else if (score >= 80) grade = "A";
        else if (score >= 70) grade = "B";
        else if (score >= 60) grade = "C";
        else grade = "D";

        s.setGrade(grade);
    }
}
