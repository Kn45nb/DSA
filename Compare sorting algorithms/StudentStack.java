import java.util.ArrayList;

public class StudentStack {
    private Node top = null;

    public void push(Student student) {
        Node newNode = new Node(student);
        newNode.next = top;
        top = newNode;
    }

    public Student pop() {
        if (isEmpty()) {
            return null;
        } else {
            Student removedStudent = top.student;
            top = top.next;
            return removedStudent;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void displayStudents() {
        if (isEmpty()) {
            System.out.println("No students to display.");
        } else {
            Node current = top;
            while (current != null) {
                System.out.println(current.student);
                current = current.next;
            }
        }
    }

    public void copyFrom(StudentStack other) {
        ArrayList<Student> temp = new ArrayList<>();
        Node current = other.top;

        while (current != null) {
            temp.add(current.student);
            current = current.next;
        }

        for (int i = temp.size() - 1; i >= 0; i--) {
            this.push(temp.get(i));
        }
    }

    public void sortStudentsMerge() {
        top = MergeSort.sort(top);
    }

    public void sortStudentsBubble() {
        top = BubbleSort.sort(top);
    }

    public void sortStudentsQuick() {
        ArrayList<Student> students = new ArrayList<>();
        while (!isEmpty()) {
            students.add(pop());
        }

        QuickSort.sort(students);

        for (int i = students.size() - 1; i >= 0; i--) {
            push(students.get(i));
        }
    }
}
