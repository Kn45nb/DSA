public class ArrayQueue {
    int[] queue;
    int front, rear, capacity;

    public ArrayQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = rear = -1;
    }

    // Enqueue operation
    void enqueue(int value) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) front = 0;
        queue[++rear] = value;
    }

    // Dequeue operation
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Dequeued: " + queue[front++]);
    }

    // Peek operation
    int peek() {
        if (front == -1 || front > rear) throw new IllegalStateException("Queue is empty");
        return queue[front];
    }
}
