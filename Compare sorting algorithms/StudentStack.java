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

    // Merge Sort
    public void sortStudentsMerge() {
        top = mergeSort(top);
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

    // Bubble Sort
    public void sortStudentsBubble() {
        if (top == null || top.next == null) {
            return;
        }

        boolean swapped;
        do {
            Node current = top;
            Node prev = null;
            swapped = false;

            while (current != null && current.next != null) {
                if (current.student.getMarks() > current.next.student.getMarks()) {
                    swapped = true;

                    // Swap nodes
                    if (prev == null) {
                        Node temp = current.next;
                        current.next = temp.next;
                        temp.next = current;
                        top = temp;
                        prev = temp;
                    } else {
                        Node temp = current.next;
                        current.next = temp.next;
                        temp.next = current;
                        prev.next = temp;
                        prev = temp;
                    }
                } else {
                    prev = current;
                    current = current.next;
                }
            }
        } while (swapped);
    }

    // QuickSort
    public void sortStudentsQuick() {
        ArrayList<Student> students = new ArrayList<>();
        while (!isEmpty()) {
            students.add(pop());
        }

        quickSort(students, 0, students.size() - 1);

        for (int i = students.size() - 1; i >= 0; i--) {
            push(students.get(i));
        }
    }

    private void quickSort(ArrayList<Student> students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);

            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private int partition(ArrayList<Student> students, int low, int high) {
        float pivot = students.get(high).getMarks();
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (students.get(j).getMarks() <= pivot) {
                i++;

                // Swap
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }

        // Swap pivot
        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);

        return i + 1;
    }
}