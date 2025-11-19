package LinkedList.linkedLIst;

public class BasicLinkedList {

    // Function to insert a new node at the end of the linked list
    public static void insertAtEnd(Node head , int val){
        Node temp = new Node(val); // Create a new node with given value
        Node t = head;             // Start from the head node
        while(t.next != null){     // Traverse to the last node
            t = t.next;
        }
        t.next = temp;             // Link the last node to the new node
    }

    // Function to display the linked list using recursion (forward order)
    public static void displayRec(Node head){
        if (head == null)                     // Base case: stop when node is null
            return;
        System.out.print(head.data + " ");    // Print current node's data
        displayRec(head.next);                // Recurse to next node
    }

    // Function to display the linked list in reverse using recursion
    public static void displayRecRiv(Node head){
        if (head == null)                     // Base case: stop when node is null
            return;
        displayRecRiv(head.next);             // Recurse to next node first
        System.out.print(head.data + " ");    // Then print current node (reverse order)
    }

    // Function to display the linked list using a loop
    public static void display(Node head){
        Node temp = head;
        System.out.print("Linked list elements are : ");
        while (temp != null){
            System.out.print(temp.data + " "); // Print data of each node
            temp = temp.next;                 // Move to next node
        }
    }

    // Function to count the number of nodes in the list
    public static int length(Node head){
        int count = 0;
        while (head != null){
            count++;             // Increment count for each node
            head = head.next;    // Move to next node
        }
        return count;            // Return total count
    }

    // Inner class to represent a Node of the linked list
    public static class Node {
        int data;      // Value of the node
        Node next;     // Reference to the next node

        Node(int data){
            this.data = data;  // Initialize the node with given data
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Creating individual nodes
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(23);

        // Connecting nodes to form the linked list: 5 -> 3 -> 9 -> 8 -> 16 -> 23
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // Insert a new node with value 37 at the end
        insertAtEnd(a, 37); // Final list: 5 -> 3 -> 9 -> 8 -> 16 -> 23 -> 37

        // Display the final list using display function
        display(a);
    }
}
