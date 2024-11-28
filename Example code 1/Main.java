import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student("S001", "Alice", 8.5));
        manager.addStudent(new Student("S002", "Bob", 5.8));

        manager.sortStudents("marks");
        manager.displayStudents();
    }
}

class Student {
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

class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean editStudent(String studentId, String newName, double newMarks) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                student.setName(newName);
                student.setMarks(newMarks);
                return true;
            }
        }
        return false;
    }

    public void deleteStudent(String studentId) {
        students.removeIf(student -> student.getStudentId().equals(studentId));
    }

    public void sortStudents(String key) {
        if (key.equals("marks")) {
            students.sort(Comparator.comparingDouble(Student::getMarks).reversed());
        } else if (key.equals("name")) {
            students.sort(Comparator.comparing(Student::getName));
        }
    }

    public Student searchStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public List<Student> searchStudentByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                result.add(student);
            }
        }
        return result;
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
