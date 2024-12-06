public class main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(new Student("Alice", 101, 8.5f));
        stack.push(new Student("Bob", 102, 6.0f));
        stack.push(new Student("Charlie", 103, 4.5f));

        System.out.println("Initial student list:");
        stack.displayStudents();

        stack.sortStudents();
        System.out.println("\nSorted student list:");
        stack.displayStudents();

        System.out.println("\nSearching for student with ID 102:");
        Student foundStudent = stack.searchStudent(102);
        if (foundStudent != null) {
            System.out.println("Found: " + foundStudent);
        }

        System.out.println("\nEditing student with ID 102:");
        stack.editStudent(102, "Bobby", 7.0f);
        stack.displayStudents();

        System.out.println("\nRemoving student with ID 103:");
        stack.pop();
        stack.displayStudents();
    }
}
