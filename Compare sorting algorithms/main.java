public class main {
    public static void main(String[] args) {
        StudentStack studentStack = new StudentStack();
        studentStack.push(new Student("101", "Alice", 8.5F));
        studentStack.push(new Student("102", "Bob", 6.0F));
        studentStack.push(new Student("103", "Charlie", 4.5F));

        System.out.println("Initial students:");
        studentStack.displayStudents();

        System.out.println("\nSorting students by marks:");
        studentStack.sortStudents();
        studentStack.displayStudents();

        System.out.println("\nEditing student with ID 102:");
        studentStack.editStudent("102", "Bobby", 7.0F);
        studentStack.displayStudents();

        System.out.println("\nDeleting student with ID 103:");
        studentStack.deleteStudent("103");
        studentStack.displayStudents();

        System.out.println("\nSearching for student with ID 101:");
        Student foundStudent = studentStack.searchStudent("101");
        if (foundStudent != null) {
            System.out.println("Found: " + foundStudent);
        }
    }
}