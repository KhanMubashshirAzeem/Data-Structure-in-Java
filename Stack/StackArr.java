package Stack;

public class StackArr {
    private int arr[] = new int[5];
    private int top = -1;
    int arrLength = 0;

    boolean isFull() {
        if (top == arr.length-1)
            return true;
        else return false;
    
    }

    boolean isEmpty() {
        if (top == -1)
            return true;
        else return false;
    }

    void push(int val)
    {
        if (isFull())
        {
            System.out.println("!!!!!!!!!Stack Overflow");
        }
        else {
            arr[++top] = val;
//            System.out.println(val+" is added in stack");
            arrLength++;
        }
    }

    void pop()
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
            System.out.println(del+" is Pop");
            arrLength--;
        }
    }

    int peek()
    {
        if (isEmpty())
        {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        System.out.println("Peek element of the stack is "+arr[top]);
        return arr[top];
    }


    void findEleUsingIndex(int idx)
    {
        System.out.println();
        for (int i = 0; i < arr.length; i++)
            if (i == idx) {
                System.out.println("Element at index " + i + " : " + arr[i-1]);
            }
    }

    void display()
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


    public static void main(String[] args) {
        StackArr s = new StackArr();
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);
        System.out.println(s.isFull());
        s.push(15);  // O/P = Stack Overflow
        s.display();
        System.out.println("Length of the stack is : "+s.arrLength);
        s.peek();
        s.pop();
        s.display();
        System.out.println("Length of the stack is : "+s.arrLength);
        s.peek();
//        s.size();
        s.push(15);  // O/P = Element is Added
        s.findEleUsingIndex(3);
        s.display();

    }
}
