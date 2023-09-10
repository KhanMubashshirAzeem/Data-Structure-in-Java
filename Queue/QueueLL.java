package Queue;

public class QueueLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        Node front = null;
        Node rear = null;
        int size = 0;


        void Enqueue(int val) {
            Node temp = new Node(val);
            if (front == null) {
                rear = front = temp;
                size++;
                return;
            }
            rear.next=temp;
            rear=temp;
            size++;
        }

        void Dequeue()
        {
            if (front == null && rear==null)
            {
                System.out.println("Queue is Empty");
            }
            front=front.next;
            System.out.println(front.data+" is removed from Queue");
            size--;
        }

        void Peek()
        {
            if (front == null && rear==null)
            {
                System.out.println("Queue is Empty");
            }
            System.out.println("The front element is : "+front.data);
        }





        void Display()
        {
            Node temp = front;
            if (front == null && rear==null)
            {
                System.out.println("Queue is Empty");
            }
            System.out.println("Queue Elements are : ");
            while (temp != null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.Enqueue(10);
        q.Enqueue(11);
        q.Enqueue(12);
        q.Enqueue(13);
        q.Enqueue(14);
        q.Enqueue(15);
        q.Display();





    }
}
