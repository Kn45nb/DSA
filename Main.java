public class Main
{
    public static void main(String[] args)
    {
        StackDemo stack = new StackDemo(5);

        System.out.println("Is the stack empty? " + stack.isEmpty());


        System.out.println("FIUỎIEOIẺUOEỦIOEỦIOỦEIOEỦIOU");
        System.out.println("AAAA");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.displayStack();

        System.out.println("Top element (peek): " + stack.peek());
        stack.displayStack();

        stack.pop();
        stack.displayStack();

        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
// test 2