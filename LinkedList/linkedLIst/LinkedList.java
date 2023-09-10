package LinkedList.linkedLIst;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        //============================ Insert element at end of the list ================================================
        void insertAtEnd(int val) {
           /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
            Node temp = new Node(val);
           /* 4. If the Linked List is empty, then make the
          new node as head */
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }


        //======================= Insert element at head of the list ================================================================
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {     //Empty List
                head = tail = temp;
            } else {        //Non Empty List
                temp.next = head;
                head = temp;
            }
            size++;
        }

        //======================= Insert element in between of the list ================================================================
        void insertAtBetween(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtHead(val);
                return;
            } else if (idx < 0 || idx > size) {
                System.out.println("Wrong index.");
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        //======================= Display element of given Index ============================================================
        int getEleAtIndex(int idx) {
            Node temp = head;
            if (idx < 0 || idx > size) {
                System.out.println("Wrong index.");
                return -1;
            }
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        //====================== Display elements of the list ===========================================================
        void display() {
            Node temp = head;
            System.out.print("\nElements are : ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        //==================== Delete element of given index ============================================================
        void deleteAt(int idx) {
            Node temp = head;
            if (idx == 0) {
                head = head.next;
                size--;
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp = tail;
            size--;
        }


        //=========================== Find middle element of the list ======================================
        void findMiddleElement() {
            if (head == null) {
                System.out.println("The list is empty.");
                return;
            }
            Node slow = head;
            Node fast = head;
            Node prevSlow = null;    // Keeps track of the previous node of the slow pointer
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                prevSlow = slow;
                slow = slow.next;
            }
            if (fast == null) {
                // The list has even number of elements
                System.out.println("The First Middle Element of the list is: " + prevSlow.data);
            } else {
                // The list has odd number of elements
                System.out.println("The Middle Element of the list is: " + slow.data);
            }
        }

        //================== Delete middle element from the list ================================================
        void deleteMiddleElement() {
            // If we have 0 or 1 element in te list then we have to return
            if (head == null || head.next == null) {
                return;
            }

            Node slow = head;
            Node fast = head;
            Node prev = null;

            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                prev = slow;
                slow = slow.next;
            }

            prev.next = slow.next;
            size--;
        }


//       int size(){   // O(n )
//           Node temp = head;
//           int count = 0;
//           while(temp!=null){
//               count++;
//               temp=temp.next;
//           }
//           return count;
//       }

    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtHead(23);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtHead(18);
        ll.insertAtHead(8);
        ll.insertAtEnd(19);
        ll.insertAtEnd(29);
        ll.insertAtEnd(9);
        System.out.println("The tail of the list is : " + ll.tail.data);
        ll.insertAtBetween(0, 100);
        System.out.println("The element at index is : " + ll.getEleAtIndex(3));
        ll.display();
        ll.findMiddleElement();
        ll.deleteMiddleElement();
        ll.display();
        System.out.println("Size of the list is : " + ll.size);


    }
}

















