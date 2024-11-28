public class main {
    public static void main(String[] args) {
        // Create a LinkedQueue instance
        LinkedQueue studentQueue = new LinkedQueue();
        
        // Enqueue students
        studentQueue.enqueue(101);  // Enqueue Student ID: 101
        studentQueue.enqueue(102);  // Enqueue Student ID: 102
        studentQueue.enqueue(103);  // Enqueue Student ID: 103

        // Dequeue students and display the output
        studentQueue.dequeue();  // Output: Dequeued: 101
        studentQueue.dequeue();  // Output: Dequeued: 102

        // Peek the next student
        int nextStudent = studentQueue.peek();  
        if (nextStudent != -1) {
            System.out.println("Next student in line: " + nextStudent);  // Output: Next student in line: 103
        }

        // Check if the queue is empty
        if (studentQueue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("The queue is not empty.");
        }
    }
}
