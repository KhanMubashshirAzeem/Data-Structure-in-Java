package LinkedList.linkedLIst;

public class FindMidEle {
    public static class Node
    {
        int data; // Value
        Node next; // Address of next node
        Node(int data){
            this.data = data;
        }
    }

    public static void findMidEle(Node head){

        Node temp1 = head;
        Node temp2 = head;
        while (true)
        {
            temp1 = temp1.next;
            temp2 = temp2.next.next;

            if (temp2.next == null )
            {
                System.out.println("Middle element for ODD list is "+temp1.data);
                return;
            }
            else if (temp2.next.next == null){
                System.out.println("Middle element for EVEN list is "+temp1.next.data);
                return;
            }
        }
    }

    public static void display(Node head)
    {
        Node temp = head;
        System.out.print("Linked list elements are : ");
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(8);
        Node e=new Node(9);
        Node f=new Node(10);
//        Node g=new Node(11);


        // 5 3 9 8 16
        a.next=b;  //5->3
        b.next=c;  //5->3->9
        c.next=d;  //5->3->9->8
        d.next=e;  //5->3->9->8->16
        e.next=f;
//        f.next=g;

        display(a);
        findMidEle(a);


    }
}