
public class MergeSort {
    public static Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextToMiddle = middle.next;
        middle.next = null;

        Node left = sort(head);
        Node right = sort(nextToMiddle);

        return merge(left, right);
    }

    private static Node merge(Node left, Node right) {
        Node dummy = new Node(null);
        Node current = dummy;

        while (left != null && right != null) {
            if (left.student.getMarks() <= right.student.getMarks()) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
        }

        return dummy.next;
    }

    private static Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
