public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(Student student) {
        Node newNode = new Node(student);
        newNode.next = top;
        top = newNode;
    }

    public Student pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        Student data = top.data;
        top = top.next;
        return data;
    }

    public Student peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    // Phương thức sắp xếp theo ID sinh viên
    public void sort() {
        if (top == null || top.next == null) {
            return; // Không cần sắp xếp nếu stack rỗng hoặc chỉ có một phần tử
        }

        boolean swapped;
        do {
            Node current = top;
            Node previous = null;
            Node nextNode = top.next;
            swapped = false;

            while (nextNode != null) {
                if (current.data.getId() > nextNode.data.getId()) {
                    // Hoán đổi dữ liệu giữa các node
                    if (previous != null) {
                        Node temp = nextNode.next;
                        previous.next = nextNode;
                        nextNode.next = current;
                        current.next = temp;
                    } else {
                        Node temp = nextNode.next;
                        top = nextNode;
                        nextNode.next = current;
                        current.next = temp;
                    }

                    // Cập nhật tham chiếu
                    previous = nextNode;
                    nextNode = current.next;
                    swapped = true;
                } else {
                    // Di chuyển đến cặp node tiếp theo
                    previous = current;
                    current = nextNode;
                    nextNode = nextNode.next;
                }
            }
        } while (swapped);
    }

    // Phương thức hiển thị tất cả sinh viên trong stack
    public void display() {
        Node current = top;
        if (current == null) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Students in the stack:");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
