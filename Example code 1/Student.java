package Example code 1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private double marks;
    private String rank;

    public Student(String studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
        this.rank = determineRank();
    }

    private String determineRank() {
        if (marks < 5.0) {
            return "Fail";
        } else if (marks < 6.5) {
            return "Medium";
        } else if (marks < 7.5) {
            return "Good";
        } else if (marks < 9.0) {
            return "Very Good";
        } else {
            return "Excellent";
        }
    }

    // Getters and Setters
    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public double getMarks() { return marks; }
    public String getRank() { return rank; }

    public void setName(String name) { this.name = name; }
    public void setMarks(double marks) { 
        this.marks = marks;
        this.rank = determineRank(); // Recalculate rank
    }

    @Override
    public String toString() {
        return studentId + " - " + name + ": " + rank;
    }
}
