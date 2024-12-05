public class StackLinkedList {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public StackLinkedList() {
        top = null;
    }

    // Push Operation
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed to stack");
    }

    // Pop Operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        } else {
            int value = top.data;
            top = top.next;
            return value;
        }
    }

    // Peek Operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return top.data;
        }
    }

    // Check if the Stack is Empty
    public boolean isEmpty() {
        return top == null;
    }
}
