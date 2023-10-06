public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Очередь переполнена. Невозможно добавить элемент.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        //System.out.println("Добавлен элемент: " + item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Очередь пуста. Невозможно извлечь элемент.");
            return -1;
        }

        int removedItem = queue[front];
        front = (front + 1) % capacity;
        size--;
        return removedItem;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Очередь пуста.");
            return -1;
        }

        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public static CircularQueue mergeQueues(CircularQueue queue1, CircularQueue queue2) {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            System.out.println("Обе очереди пусты. Нечего объединять.");
            return null;
        }

        CircularQueue mergedQueue = new CircularQueue(queue1.capacity + queue2.capacity);

        while (!queue1.isEmpty()) {
            mergedQueue.enqueue(queue1.dequeue());
        }

        while (!queue2.isEmpty()) {
            mergedQueue.enqueue(queue2.dequeue());
        }

        return mergedQueue;
    }
}
