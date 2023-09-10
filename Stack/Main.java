package Stack;

public class Main {
    private int arr[];
    private int top;
    private int capacity;
    int length;

    // Creating a stack
    Main(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
        length=0;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int val)
    {
        if (isFull())
        {
            System.out.println("!!!!!!!!!Stack Overflow");
        }
        else {
            arr[++top] = val;
            System.out.println(val+" is added in stack");
            length++;
        }
    }

    public void pop()
    {
        int del;
        System.out.println();
        if (isEmpty())
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            del = arr[top];
            arr[top] = arr[--top];
            System.out.println("Poped element is : "+del);
            length--;
        }
    }

    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Stack UnderFlow");
        }
        System.out.println("Peek element of the stack is "+arr[top]);
        return arr[top];
    }

    public void display()
    {
        System.out.print("Displaying an element of a stack :");
        if (isEmpty())
        {
            System.out.println("Stack UnderFlow");
        }
        for (int i=0; i<=top ; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

//    public void size()
//    {
//        int size = 0;
//        if (isEmpty())
//        {
//            System.out.println("Stack UnderFlow");
//        }
//        for (int i=1; i<=top+1; i++)
//        {
//            size=size+1;
//        }
//        System.out.println("Size of the stack is : "+size);
//    }

    public static void main(String[] args) {
        Main m = new Main( 5);
        m.push(10);
        m.push(11);
        m.push(12);
        m.push(13);
        m.push(14);
        m.push(15);  // O/P = Stack Overflow
        m.display();
        System.out.println("Length of the stack is : "+m.length);
        m.peek();
        m.pop();
        m.display();
        System.out.println("Length of the stack is : "+m.length);
        m.peek();
//        s.size();  //Instead of size function we will use length variable to calculate the length of the stack
        m.push(15);  // O/P = Element is Added


    }
}


