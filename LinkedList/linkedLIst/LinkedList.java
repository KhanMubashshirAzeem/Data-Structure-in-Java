package LinkedList.linkedLIst;


// LinkedList with  al the operations

public class LinkedList {

    //=================== Node Class ===========================
    public static class Node {
        int data;      // Data part of the node
        Node next;     // Reference to next node

        Node(int data) {
            this.data = data;  // Initialize node with data
        }
    }

    //=================== Linked List Implementation ===========================
    public static class linkedList {
        Node head = null;   // First node
        Node tail = null;   // Last node
        int size = 0;       // Number of elements

        //========= Insert element at the end of the list ==========
        void insertAtEnd(int val) {
            Node temp = new Node(val);  // Create new node
            if (head == null) {         // If list is empty
                head = temp;
            } else {
                tail.next = temp;       // Link last node to new node
            }
            tail = temp;                // Update tail
            size++;                     // Increase size
        }

        //========= Insert element at the head of the list ==========
        void insertAtHead(int val) {
            Node temp = new Node(val);  // Create new node
            if (head == null) {         // Empty list
                head = tail = temp;
            } else {
                temp.next = head;       // Point new node to current head
                head = temp;            // Update head
            }
            size++;
        }

        //========= Insert element at specific index ==========
        void insertAtBetween(int idx, int val) {
            Node t = new Node(val);     // New node to insert
            Node temp = head;

            if (idx == size) {
                insertAtEnd(val);       // Add at end
                return;
            } else if (idx == 0) {
                insertAtHead(val);      // Add at head
                return;
            } else if (idx < 0 || idx > size) {
                System.out.println("Wrong index.");  // Index out of range
                return;
            }

            // Traverse to the previous node of index
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }

            t.next = temp.next; // New node points to current node at idx
            temp.next = t;      // Previous node points to new node
            size++;
        }

        //========= Get element at specific index ==========
        int getEleAtIndex(int idx) {
            Node temp = head;

            if (idx < 0 || idx >= size) {
                System.out.println("Wrong index.");
                return -1;
            }

            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }

            return temp.data;
        }

        //========= Display list elements ==========
        void display() {
            Node temp = head;
            System.out.print("\nElements are : ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        //========= Delete element at a given index ==========
        void deleteAt(int idx) {
            Node temp = head;

            if (idx == 0) {           // Delete head
                head = head.next;
                size--;
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;  // Skip over the deleted node
            size--;
        }

        //========= Find the middle element using slow and fast pointers ==========
        void findMiddleElement() {
            if (head == null) {
                System.out.println("The list is empty.");
                return;
            }

            Node slow = head;
            Node fast = head;
            Node prevSlow = null;

            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                prevSlow = slow;
                slow = slow.next;
            }

            if (fast == null) {
                // Even length list - print first middle
                System.out.println("The First Middle Element of the list is: " + prevSlow.data);
            } else {
                // Odd length list - print middle
                System.out.println("The Middle Element of the list is: " + slow.data);
            }
        }

        //========= Delete the middle element of the list ==========
        void deleteMiddleElement() {
            if (head == null || head.next == null) {
                return;  // Nothing to delete
            }

            Node slow = head;
            Node fast = head;
            Node prev = null;

            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                prev = slow;
                slow = slow.next;
            }

            prev.next = slow.next;  // Remove the middle node
            size--;
        }

        //========= Alternative size method (O(n)) ==========
        // int size(){
        //     Node temp = head;
        //     int count = 0;
        //     while(temp!=null){
        //         count++;
        //         temp=temp.next;
        //     }
        //     return count;
        // }

    }

    //====================== Main Method ================================
    public static void main(String[] args) {
        linkedList ll = new linkedList();

        // Inserting elements
        ll.insertAtHead(23);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtHead(18);
        ll.insertAtHead(8);
        ll.insertAtEnd(19);
        ll.insertAtEnd(29);
        ll.insertAtEnd(9);

        // Display tail node
        System.out.println("The tail of the list is : " + ll.tail.data);

        // Insert at specific index
        ll.insertAtBetween(0, 100);

        // Get element at index
        System.out.println("The element at index is : " + ll.getEleAtIndex(3));

        // Display all elements
        ll.display();

        // Find and delete middle element
        ll.findMiddleElement();
        ll.deleteMiddleElement();

        // Display updated list
        ll.display();

        // Print size
        System.out.println("Size of the list is : " + ll.size);
    }
}
