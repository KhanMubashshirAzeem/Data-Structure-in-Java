package Queue;

import java.util.Scanner;

public class QueueArr2 {
    static private int front, rear, capacity, size;
    static private int[] queue;

    QueueArr2(int c) {
        size = 0;
        capacity = c;
        front = rear = 0;
        queue = new int[capacity];
    }

    void Enqueue(int val) {
        if (capacity == rear) {
            System.out.println("!!!! Queue is full new element cant be inserted !!!!");
            return;
        }
        queue[rear] = val;
        System.out.println(queue[rear] + " added in Queue");
        rear++;
        size++;
    }

    void Dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        } else {
            System.out.println(queue[front] + " deleted from Queue");
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];    // It shifts each element in the queue to the left by one position.
            }
            if (rear < capacity)
                queue[rear] = 0;
            rear--;
            size--;
        }
    }

    void Front() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(queue[front] + " is front element of Queue");
    }


    void deleteEleUsingIdx(int idx) {
        int i , j;
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        if (idx <0 || idx >= queue.length)
        {
            System.out.println("Please Enter Valid Index");
            return;
        }
        for(i=0 ; i<rear ; i++)
        {
            if (i == idx-1) {
                System.out.println(queue[i] +" is deleted from index "+ (i+1));
                for (j=idx-1 ; j<rear ; j++)
                {
                    queue[j] = queue[j+1];
                }
            }
        }
        if (rear < capacity)
            queue[rear] = 0;
        rear--;
        size--;
    }


    void displayEleUsingIdx(int idx) {
        int i;
        for (i = 0; i <= queue.length; i++) {
            if (i == idx-1) {
                System.out.println(queue[i] +" is present at index "+ (i+1));
            }
        }
    }

    void Display() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("The element in queue are : ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity of the queue: ");
        int capacity = sc.nextInt();

        QueueArr2 q = new QueueArr2(capacity);

        while (true) {
            System.out.println("QUEUE OPERATIONS:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Front");
            System.out.println("4. Display");
            System.out.println("5. Display Element By Given Index");
            System.out.println("6. Delete Element By Given Index");
            System.out.println("ToDo : Display Rear Element");
            System.out.println("7. Size");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to Enqueue: ");
                    int element = sc.nextInt();
                    q.Enqueue(element);
                    break;
                case 2:
                    q.Dequeue();
                    break;
                case 3:
                    q.Front();
                    break;
                case 4:
                    q.Display();
                    break;
                case 5:
                    System.out.println("Enter Index To Display Element ");
                    int disI = sc.nextInt();
                    q.displayEleUsingIdx(disI);
                    break;
                case 6:
                    System.out.println("Enter Index to Delete Element ");
                    int delI = sc.nextInt();
                    q.deleteEleUsingIdx(delI);
                    break;
                case 7:
                    System.out.println(size);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;
//                    sc.close();
//                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println();


        }
    }
}
