package LinkedList.linkedLIst;

class PracticeLL{
    public static class Node
    {
        int data;
        Node next;
        Node (int data)
        {
            this.data=data;
        }
    }

    public static class linkedList
    {
        Node head = null;
        Node tail = null;
        int size = 0;           // Note : increase size by one after every addition operation

        void insertAtEnd(int val)
        {
            Node temp = new Node(val);  //making a temporary node for storing the value
            if (head==null)             // If starting head is null then put the value of temp in head.
            {
                head=tail=temp;
            }
            else                        // If head is not null them put the value of temp in next of tail.
            {
                tail.next=temp;
            }
            tail=temp;                  // And make tail and temp equal which help us to add new element at the last.
            size++;
        }

        void insertAtHead(int val)
        {
            Node temp = new Node(val);  //making a temporary node for storing the value
            if (head==null)
            {
                head=tail=temp;         // If starting head is null then put the value of temp in head.
            }
            else
            {
                temp.next=head;         // Putting the temp value before Head.
                head=temp;              // Again make head = temp.
            }
            size++;
        }

        void insertAt(int idx, int val)
        {
            Node t = new Node(val);   // Node t have value
            Node temp = head;         // at start temp = head
            if (idx==size){
                insertAtEnd(val);
                return;
            }
            else if (idx==0) {
                insertAtHead(val);
                return;
            }
            else if (idx<0 || idx>size)
            {
                System.out.println("Wrong Index");
            }
            for (int i=1 ; i<=idx-1 ; i++)
            {
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next = t;
            size++;
        }

        void display()
        {
            Node temp = head;           //
            System.out.print("The element in the list are : ");
            while (temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();

        ll.insertAtEnd(5);
        ll.insertAtEnd(4);
        ll.insertAtEnd(15);
        ll.insertAtEnd(68);
        ll.insertAtEnd(98);
        ll.insertAtHead(3);
        ll.insertAtHead(91);
        ll.insertAt(2,47);
        ll.display();
        System.out.println("The size of the list is : "+ll.size);
    }
}