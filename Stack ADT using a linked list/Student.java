public class Student {
    private String name;
    private int id;
    private float marks;

    public Student(String name, int id, float marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public float getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getRank() {
        if (marks < 5.0) return "Fail";
        else if (marks < 6.5) return "Medium";
        else if (marks < 7.5) return "Good";
        else if (marks < 9.0) return "Very Good";
        else return "Excellent";
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + ", rank=" + getRank() + "}";
    }
}
