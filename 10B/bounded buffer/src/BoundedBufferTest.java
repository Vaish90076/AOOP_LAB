public class BoundedBufferTest {
    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer(10); // Buffer capacity of 10

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        // Start the producer and consumer threads
        producerThread.start();
        consumerThread.start();
    }
}
