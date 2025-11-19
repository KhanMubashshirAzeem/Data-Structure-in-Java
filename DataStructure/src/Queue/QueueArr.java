package Queue;

public class QueueArr {
    static private int front, rear, capacity, size;
    static private int queue[];

    QueueArr(int c) {
        size = 0;
        capacity = c;
        front = rear = 0;
        queue = new int[capacity];
    }

    void Enqueue(int val) {
        if (capacity == rear) {
            System.out.println("Queue is full new element can't be inserted");
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
        }
        else {
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
        int i;
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
                for (i=idx-1 ; i<rear ; i++)
                {
                    queue[i] = queue[i+1];
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
        QueueArr q = new QueueArr(10);
        q.Enqueue(10);
        q.Enqueue(11);
        q.Enqueue(12);
        q.Enqueue(13);
        q.Enqueue(14);
        q.Dequeue();
        q.Enqueue(15);
        q.Front();
        q.Display();
        System.out.println("The length of queue is " + size);
        q.Enqueue(16);
        q.Display();
        q.displayEleUsingIdx(3);
        q.deleteEleUsingIdx(3);
        q.Display();


    }
}
