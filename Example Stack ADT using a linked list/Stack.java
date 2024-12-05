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
}