public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(Student student) {
        Node newNode = new Node(student);
        newNode.next = top;
        top = newNode;
        System.out.println("Thêm: " + student);
    }

    public Student pop() {
        if (isEmpty()) {
            System.out.println("Stack rỗng. Không thể xóa.");
            return null;
        }
        Student removedStudent = top.data;
        top = top.next;
        System.out.println("Xóa: " + removedStudent);
        return removedStudent;
    }

    public Student searchStudent(int id) {
        Node current = top;
        while (current != null) {
            if (current.data.getId() == id) {
                return current.data;
            }
            current = current.next;
        }
        System.out.println("Không tìm thấy sinh viên có ID: " + id);
        return null;
    }

    public void editStudent(int id, String newName, float newMarks) {
        Student student = searchStudent(id);
        if (student != null) {
            student.setName(newName);
            student.setMarks(newMarks);
            System.out.println("Cập nhật thông tin sinh viên ID " + id);
        }
    }

    public void displayStudents() {
        if (isEmpty()) {
            System.out.println("Không có sinh viên nào để hiển thị.");
        } else {
            Node current = top;
            System.out.println("Danh sách sinh viên trong stack:");
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public void sortStudents() {
        if (top == null || top.next == null) return;

        // Merge Sort
        top = mergeSort(top);
        System.out.println("Sinh viên đã được sắp xếp.");
    }

    private Node mergeSort(Node head) {
        if (head == null || head.next == null) return head;

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
            if (left.data.getMarks() <= right.data.getMarks()) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        current.next = (left != null) ? left : right;
        return dummy.next;
    }

    private Node getMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
