
package array;

public class ArrayStack{

    private int[] stack;
    private int top;
    private int capacity;

    public ArrayStack(int capicity) {
        this.capacity = capicity;
        stack = new int[capacity];
        top = -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmty() {
        return top == -1;
    }

    public void display() {
        if (isEmty()) {
            System.out.println("Stack is emty");
            return;
        }
        System.out.println("Stack is emty.");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);

        }
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow! Stack is full.");
            return;
        }
        top++;
        stack[top] = value;
    }

    public int pop() {
        if (isEmty()) {
            System.out.println("Stack undedrflow! Stack is emty.");
            return -1;
        }
        int value = stack[top];
        top--;
        return value;
    }

    public int peek() {
        if (isEmty()) {
            System.out.println("Stack is emty");
            return -1;
        }
        return stack[top];
    }

    public static void main(String[] args) {

        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println();

        stack.display();

        System.out.println();

        System.out.println("Top element: " + stack.peek());

        System.out.println();

        System.out.println("Removed: " + stack.pop());

        System.out.println();

        System.out.println("Top element: " + stack.peek());

        System.out.println();

        stack.display();
    }
}
