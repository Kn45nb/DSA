public class MemoryStackExample {
    public static void main(String[] args) {
        int result = sum(5, 3);  // Calls sum function
        System.out.println("Result: " + result);
    }

    static int sum(int a, int b) {
        return a + b;  // Result pushed onto the stack
    }
}

/*
 * Execution Steps:
 * 
 * Main Method:         main() starts and creates its stack frame.
 * sum() Call:          A new stack frame is created for sum().
 * Return to main():    The sum() stack frame is popped after execution, and control returns to main().
 * 
 */