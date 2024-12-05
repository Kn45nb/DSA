public class main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        Student student3 = new Student("Charlie", 3);

        System.out.println("Pushing students onto stack...");
        stack.push(student1);
        stack.push(student2);
        stack.push(student3);

        System.out.println("Top of stack: " + stack.peek());

        System.out.println("Popping students from stack...");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}