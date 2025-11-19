package LinkedList.Doubly;

public class BasicDLL {


    public static class Node
    {
        int val;
        Node next;
        Node prev;
        Node(int val)
        {
            this.val=val;
        }
    }

    public static void display(Node head)
    {
        Node temp = head;
        System.out.print("The element in the list are : ");
        while (temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void displayRev(Node tail)
    {
        Node temp = tail;
        System.out.print("List in reverse order  : ");
        while (temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public static void displayRan(Node random)
    {
        Node temp = random;
        while (temp.prev!=null)
        {
            temp=temp.prev;
        }
        System.out.print("Printing list from random given number : ");
        while (temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void size(Node head)
    {
        Node temp = head;
        int count=0;
        while (temp!=null)
        {
            temp=temp.next;
            count++;
        }
        System.out.println("The size of the linked list is : "+count);
    }




    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
//        display(a);
//        size(a);
//        displayRev(e);
        displayRan(c);


    }
}
