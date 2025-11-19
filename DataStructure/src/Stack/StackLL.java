package Stack;

public class StackLL {
    public static class Node {
        int data;  // Data
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class stack {
        Node top = null;
        int size = 0;

        void push(int val) {
            Node temp = new Node(val);

            if (top == null) {
                top = temp;
                size++;
                return;
            }

            temp.next = top;
            top = temp;
            size++;
        }

        void pop() {
            if (top == null) {
                System.out.println("There is no element in the stack to be Pop");
                return;
            }
            System.out.println(top.data + " is deleted");
            top = top.next;
            size--;
        }

        void peek() {
            if (top == null) {
                System.out.println("There is no element at the top of stack");
            } else {
                System.out.println("The top most element of stack is " + top.data);
            }
        }




        void displayRec(Node head) {
            if (head == null) return;
            displayRec(head.next);
            System.out.print(head.data + " ");
        }
        void display() {
            System.out.print("The element in stack are : ");
            displayRec(top);
            System.out.println();
        }


        void displayRev() {
            Node current = top;
            if (top == null) {
                System.out.println("There is no element in the stack to Display");
                return;
            }
            System.out.print("Stack Element in Reverse order : ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        boolean isEmpty() {
            if (size == 0) return true;
            else return false;
        }


    }


    public static void main(String[] args) {
        stack st = new stack();
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        System.out.println("The size of the stack is " + st.size);
        st.push(14);
        st.peek();
        st.push(15);
        st.display();
        st.pop();
        st.display();
        System.out.println("The size of the stack is " + st.size);
        st.pop();
        st.push(100);
        st.display();
        System.out.println("The size of the stack is " + st.size);
        st.displayRev();
    }
}
