class StackLinkedList {
    private Node top;

    public StackLinkedList() {
        top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int value = top.data;
            top = top.next;
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return top.data;
        }
    }

    public boolean isEmpty() {
        return (top == null);
    }
}