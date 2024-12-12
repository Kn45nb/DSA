public class StudentStack {
    private Node top = null;

    public void push(Student student) {
        Node newNode = new Node(student);
        newNode.next = top;
        top = newNode;
        System.out.println("Added: " + student.getStudentName());
    }

    public Student pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No student to remove.");
            return null;
        } else {
            Student removedStudent = top.student;
            top = top.next;
            System.out.println("Removed: " + removedStudent.getStudentName());
            return removedStudent;
        }
    }

    public Student peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        } else {
            return top.student;
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
            System.out.println("Students in the stack:");
            while (current != null) {
                System.out.println(current.student);
                current = current.next;
            }
        }
    }

    public void sortStudents1() {
        top = mergeSort(top);
        System.out.println("Students sorted by marks.");
    }

    private Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextToMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextToMiddle);

        return merge(left, right);
    }

    private Node merge(Node left, Node right) {
        Node dummy = new Node(null);
        Node current = dummy;

        while (left != null && right != null) {
            if (left.student.getMarks() <= right.student.getMarks()) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
        }

        return dummy.next;
    }

    private Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Student searchStudent(String studentID) {
        Node current = top;
        while (current != null) {
            if (current.student.getStudentID().equals(studentID)) {
                return current.student;
            }
            current = current.next;
        }
        System.out.println("Student with ID " + studentID + " not found.");
        return null;
    }

    public void editStudent(String studentID, String name, float marks) {
        Student student = searchStudent(studentID);
        if (student != null) {
            student.setStudentName(name);
            student.setMarks(marks);
            System.out.println("Updated details for student ID: " + studentID);
        }
    }

    public void deleteStudent(String studentID) {
        if (isEmpty()) {
            System.out.println("Stack is empty. No student to delete.");
        } else if (top.student.getStudentID().equals(studentID)) {
            pop();
        } else {
            Node current = top;
            while (current.next != null && !current.next.student.getStudentID().equals(studentID)) {
                current = current.next;
            }

            if (current.next != null) {
                current.next = current.next.next;
                System.out.println("Deleted student with ID: " + studentID);
            } else {
                System.out.println("Student with ID " + studentID + " not found.");
            }
        }
    }
}