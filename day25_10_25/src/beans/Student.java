package beans;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student>{
	private int rollno;
    private String sname;
    private String course;
    private double attendance_percentage;
    private double score;
    private String grade;

    // Default Constructor
    public Student() {}

    // Parameterized Constructor
    public Student(int rollno, String sname, String course, double attendance_percentage, double score) {
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        this.attendance_percentage = attendance_percentage;
        this.score = score;
    }

    // Getters and Setters
    public int getRollno() { return rollno; }
    public void setRollno(int rollno) { this.rollno = rollno; }

    public String getSname() { return sname; }
    public void setSname(String sname) { this.sname = sname; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public double getAttendance_percentage() { return attendance_percentage; }
    public void setAttendance_percentage(double attendance_percentage) { this.attendance_percentage = attendance_percentage; }

    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    // Compare based on attendance (Descending order)
    @Override
    public int compareTo(Student s) {
        return Double.compare(s.attendance_percentage, this.attendance_percentage);
    }

    @Override
    public String toString() {
        return rollno + " - " + sname + " - " + course + " - " + attendance_percentage + "% - " + score + " - Grade: " + grade;
    }
	
}
