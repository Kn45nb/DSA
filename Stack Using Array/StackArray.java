public class StackArray {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackArray(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    // Push Operation
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack");
        }
    }

    // Pop Operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Peek Operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Check if the Stack is Empty
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
