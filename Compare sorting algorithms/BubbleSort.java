public class BubbleSort {
    public static Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        boolean swapped;
        do {
            Node current = head;
            Node prev = null;
            swapped = false;

            while (current != null && current.next != null) {
                if (current.student.getMarks() > current.next.student.getMarks()) {
                    swapped = true;

                    // Swap nodes
                    if (prev == null) {
                        Node temp = current.next;
                        current.next = temp.next;
                        temp.next = current;
                        head = temp;
                        prev = temp;
                    } else {
                        Node temp = current.next;
                        current.next = temp.next;
                        temp.next = current;
                        prev.next = temp;
                        prev = temp;
                    }
                } else {
                    prev = current;
                    current = current.next;
                }
            }
        } while (swapped);

        return head;
    }
}
