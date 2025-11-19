package LinkedList.linkedLIst;

public class CycleLinkedList {

    public static class Node {
        int data; // Value
        Node next; // Address of next node
        Node(int data) {
            this.data = data;
        }
    }

    public static boolean hasCycle(Node head)
    {
        if (head == null )
        {
            return false;
        }
        if (head.next == null)
        {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if (fast.next.next==null || fast.next==null)
            {
                return false;
            }
            else if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(23);

        // 5 3 9 8 16
        a.next = b;  //5->3
        b.next = c;  //5->3->9
        c.next = d;  //5->3->9->8
        d.next = e;  //5->3->9->8->16
        e.next = f;
        f.next = b;

        System.out.println(hasCycle(a));

    }
}
