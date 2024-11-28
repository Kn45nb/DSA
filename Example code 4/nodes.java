class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedQueue {
    Node front, rear;

    public LinkedQueue() {
        this.front = this.rear = null;
    }

    // Enqueue operation
    void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue operation
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Dequeued: " + front.data);
        front = front.next;
        if (front == null) rear = null;
    }

    // Peek operation
    int peek() {
        if (front == null) throw new IllegalStateException("Queue is empty");
        return front.data;
    }
}
