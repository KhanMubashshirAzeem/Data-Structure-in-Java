package LinkedList.linkedLIst;

public class DeleteMiddleEle {
    public static class Node
    {
        int data; // Value
        Node next; // Address of next node
        Node(int data){
            this.data = data;
        }
    }

    public void delMidEle(Node head)
    {

    }

    public static void display(FindMidEle.Node head)
    {
        FindMidEle.Node temp = head;
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
        Node g=new Node(11);


        // 5 3 9 8 16
        a.next = b;  //5->3
        b.next = c;  //5->3->9
        c.next = d;  //5->3->9->8
        d.next = e;  //5->3->9->8->16
        e.next = f;
        f.next=g;
    }
}
