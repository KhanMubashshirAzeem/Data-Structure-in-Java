package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return; // Queue is already empty
        }

        // Dequeue the front element
        int front = queue.poll();

        // Reverse the rest of the queue
        reverseQueue(queue);

        // Enqueue the front element at the rear
        queue.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        // Reverse the queue
        reverseQueue(queue);

        // Dequeue and print the reversed queue
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
