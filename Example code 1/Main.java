public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student("S001", "Alice", 8.5));
        manager.addStudent(new Student("S002", "Bob", 5.8));

        manager.sortStudents("marks");
        manager.displayStudents();
    }
}
