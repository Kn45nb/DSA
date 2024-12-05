public class Student {
    private int marks;  // Encapsulated data

    // Getter method
    public int getMarks() {
        return marks;
    }

    // Setter method
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {  // Validating input
            this.marks = marks;
        } else {
            System.out.println("Invalid marks.");
        }
    }
}
