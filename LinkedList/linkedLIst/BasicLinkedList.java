package LinkedList.linkedLIst;

public class BasicLinkedList {

    public static void insertAtEnd(Node head , int val){
        Node temp = new Node(val);
        Node t=head;
        while(t.next != null){
            t = t.next;
        }
        t.next = temp;
    }

    // Printing list using recursion
    public static void displayRec(Node head){
        if (head==null)                     // Base case.
            return;
        System.out.print(head.data+" ");    // initial print.
        displayRec(head.next);              // Call to all element.
    }


    // Printing list in reverse order using recursion
    public static void displayRecRiv(Node head){
        if (head==null)                     // Base case.
            return;
        displayRecRiv(head.next);              // Call to all element.f
            System.out.print(head.data+" ");    // initial print.
    }


    public static void display(Node head)
    {
        Node temp = head;
        System.out.print("Linked list elements are : ");
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }



    public static int length(Node head){
        int count = 0;
        while (head!=null){
            count++;
            head = head.next;
        }
        return count;
    }


    public static class Node
    {
        int data; // Value
        Node next; // Address of next node
        Node(int data){
            this.data = data;
        }
    }


    public static void main(String[] args)
    {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);
        Node f=new Node(23);

              // 5 3 9 8 16
        a.next=b;  //5->3
        b.next=c;  //5->3->9
        c.next=d;  //5->3->9->8
        d.next=e;  //5->3->9->8->16
        e.next=f;

//                //Checking output
//        System.out.println(a.next.data); //3
//        System.out.println(a.data);  //5
//        System.out.println(a.next.next.data);  // Will print value of "C" => 9


//                // Displaying List using For-Loop (When we know the no of element are there in list)
//        Node temp = a;
////        System.out.println(temp.data); // 5
//        System.out.print("Diplaying linked list using Loop : ");
//        for (int i=0;i<5;i++){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }


//                // Display list Using While-Loop (When we don't know the number of element are there in list
//          Node temp = a;
//        System.out.print("Displaying list using while loop : ");
//          while (temp!=null){
//              System.out.print(temp.data+" ");
//              temp = temp.next;
//          }

//                 // Display list using function
//        display(a);  // Displaying list using while loop in function : 5 3 9 8 16
//        System.out.println();
//        display(c);  // Displaying list using while loop in function : 9 8 16

//                 // Display list using recursion
//        System.out.print("List using recursion : ");
//        displayRec(a);

//                  //Display list in reverse using recursion
//        System.out.print("List in reverse order using recursion : ");
//        displayRecRiv(a);

                    //Printing length of List
//        System.out.println(length(a));

        insertAtEnd(a,37);
        display(a);
    }

}
