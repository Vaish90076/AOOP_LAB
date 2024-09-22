import java.util.LinkedList;
import java.util.Queue;

public class BoundedBuffer {
    private Queue<Integer> buffer = new LinkedList<>();
    private int capacity;

    public BoundedBuffer(int capacity) {
        this.capacity = capacity;
    }

    // Synchronized method for adding items to the buffer
    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            System.out.println("Buffer is full. Producer is waiting...");
            wait(); // Wait until there's space in the buffer
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notify(); // Notify the consumer that a new item is available
    }

    // Synchronized method for consuming items from the buffer
    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty. Consumer is waiting...");
            wait(); // Wait until there's an item to consume
        }
        int item = buffer.remove();
        System.out.println("Consumed: " + item);
        notify(); // Notify the producer that space is available in the buffer
        return item;
    }
}
