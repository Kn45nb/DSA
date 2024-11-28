public class Node {
    int data;     // The value stored in the node
    Node next;    // Reference to the next node

    // Constructor to initialize a node with data
    public Node(int data) {
        this.data = data;
        this.next = null;   // Initialize the next reference as null
    }
}
