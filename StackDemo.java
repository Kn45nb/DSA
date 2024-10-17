class StackDemo
{
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackDemo(int size)
    {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    public boolean isFull()
    {
        return (top == maxSize - 1);
    }

    public void push(int value)
    {
        if (isFull()) System.out.println("Stack is full, cannot push " + value);
        else
        {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " into the stack");
        }
    }

    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty, cannot pop");
            return -1;
        }
        else
        {
            int poppedValue = stackArray[top--];
            System.out.println("Popped " + poppedValue + " from the stack");
            return poppedValue;
        }
    }

    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty, cannot peek");
            return -1;
        }
        else
        {
            System.out.println("Peeked at top element: " + stackArray[top]);
            return stackArray[top];
        }
    }

    public void displayStack()
    {
        if (isEmpty()) System.out.println("Stack is empty");
        else
        {
            System.out.println("Stack elements:");
            for (int i = 0; i <= top; i++) System.out.println(stackArray[i]);           
        }
    }
}
