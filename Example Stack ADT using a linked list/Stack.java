public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    // Thêm sinh viên vào stack
    public void push(Student student) {
        Node newNode = new Node(student);
        newNode.next = top;
        top = newNode;
        System.out.println("Added: " + student.getName());
    }

    // Loại bỏ sinh viên khỏi stack
    public Student pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        Student data = top.data;
        top = top.next;
        System.out.println("Removed: " + data.getName());
        return data;
    }

    // Lấy sinh viên ở đỉnh stack
    public Student peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return top.data;
    }

    // Kiểm tra stack trống hay không
    public boolean isEmpty() {
        return top == null;
    }

    // Hiển thị tất cả sinh viên trong stack
    public void displayStudents() {
        if (isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        Node current = top;
        System.out.println("Students in the stack:");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Tìm kiếm sinh viên theo ID
    public Student searchStudent(int id) {
        Node current = top;
        while (current != null) {
            if (current.data.getId() == id) {
                return current.data;
            }
            current = current.next;
        }
        System.out.println("Student with ID " + id + " not found.");
        return null;
    }

    // Chỉnh sửa thông tin sinh viên theo ID
    public void editStudent(int id, String name) {
        Student student = searchStudent(id);
        if (student != null) {
            student.setName(name);
            System.out.println("Updated student with ID " + id);
        }
    }

    // Xóa sinh viên khỏi stack theo ID
    public void deleteStudent(int id) {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        if (top.data.getId() == id) {
            pop();
            return;
        }
        Node current = top;
        while (current.next != null) {
            if (current.next.data.getId() == id) {
                current.next = current.next.next;
                System.out.println("Deleted student with ID " + id);
                return;
            }
            current = current.next;
        }
        System.out.println("Student with ID " + id + " not found.");
    }
}
