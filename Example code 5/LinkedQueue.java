public class LinkedQueue {
    private Node front;  // Points to the front of the queue
    private Node rear;   // Points to the rear of the queue

    // Constructor to initialize an empty queue
    public LinkedQueue() {
        this.front = this.rear = null;
    }

    // Enqueue operation: Add an element to the rear of the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);  // Create a new node with the given data
        
        if (rear == null) {             // If the queue is empty
            front = rear = newNode;     // Set both front and rear to the new node
            System.out.println("Enqueued: " + data);
            return;
        }

        rear.next = newNode;  // Link the new node to the rear
        rear = newNode;       // Update the rear pointer
        System.out.println("Enqueued: " + data);
    }

    // Dequeue operation: Remove an element from the front of the queue
    public int dequeue() {
        if (front == null) {  // Check if the queue is empty
            System.out.println("Queue is empty. Nothing to dequeue.");
            return -1;        // Return -1 as an error code
        }

        int dequeuedValue = front.data;  // Get the value at the front
        front = front.next;              // Move the front pointer to the next node
        
        if (front == null) {  // If the queue is now empty
            rear = null;       // Set rear to null
        }
        System.out.println("Dequeued: " + dequeuedValue);
        return dequeuedValue;  // Return the dequeued value
    }

    // Peek operation: Get the front element without removing it
    public int peek() {
        if (front == null) {  // Check if the queue is empty
            System.out.println("Queue is empty.");
            return -1;        // Return -1 as an error code
        }
        return front.data;    // Return the data at the front of the queue
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;  // Returns true if front is null
    }
}
