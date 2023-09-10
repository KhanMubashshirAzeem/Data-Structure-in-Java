package LinkedList.Doubly;

public class DoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }

    }

    public static class doublyLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertAthead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head.prev = temp;
            }
            head = temp;
            size++;
        }

        void insertAtBetween(int idx, int val) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid index!");
                return;
            }

            Node t = new Node(val);
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next.prev = t;
            temp.next = t;
            t.prev = temp;
            size++;
        }

        void display() {
            Node temp = head;
            System.out.print("The element in the list are : ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        doublyLL dll = new doublyLL();
        dll.insertAtEnd(15);
        dll.insertAtEnd(16);
        dll.insertAtEnd(17);
        dll.insertAtEnd(18);
        dll.insertAtEnd(19);
        dll.insertAtEnd(20);
        dll.insertAthead(14);
        dll.insertAthead(21);
        dll.insertAtBetween(4, 27);
        dll.display();
    }
}
