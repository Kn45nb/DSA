public class Student {
    private String studentID;
    private String studentName;
    private float marks;

    public Student(String studentID, String studentName, float marks) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.marks = marks;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getRank() {
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

    @Override
    public String toString() {
        return "ID: " + studentID + ", Name: " + studentName + ", Marks: " + marks + ", Rank: " + getRank();
    }
}