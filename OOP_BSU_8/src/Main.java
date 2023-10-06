public class Main {
    public static void main(String[] args) {
        CircularQueue queue1 = new CircularQueue(3);
        queue1.enqueue(4);
        queue1.enqueue(5);
        queue1.enqueue(6);

        CircularQueue queue2 = new CircularQueue(3);
        queue2.enqueue(1);
        queue2.enqueue(2);
        queue2.enqueue(3);


        CircularQueue mergedQueue = CircularQueue.mergeQueues(queue2, queue1);

        System.out.println("Объединенная очередь:");
        while (!mergedQueue.isEmpty()) {
            System.out.println(mergedQueue.dequeue());
        }
    }
}