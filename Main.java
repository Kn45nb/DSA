public class Main
{
    public static void main(String[] args)
    {
        StackDemo stack = new StackDemo(5);

        System.out.println("Is the stack empty? " + stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("new code github");

        stack.displayStack();

        System.out.println("Top element (peek): " + stack.peek());
        stack.displayStack();

        stack.pop();
        stack.displayStack();

        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}